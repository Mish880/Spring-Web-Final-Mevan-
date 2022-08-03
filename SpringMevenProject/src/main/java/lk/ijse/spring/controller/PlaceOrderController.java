package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ReservationDto;
import lk.ijse.spring.service.PurchaseReservationService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("placeorder")
@CrossOrigin
public class PlaceOrderController {

    @Autowired
    PurchaseReservationService purchaseReservationService;

   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseUtil  getAllPurchaseRes(){ return new ResponseUtil(200,"Ok",purchaseReservationService.getAllPurchaseRes()); }

   @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil purchaseReservation(@RequestBody ReservationDto reservationDto) {
       purchaseReservationService.purchaseReservation(reservationDto);
       return new ResponseUtil(200,"Save", null);
   }

   @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updatepurchaseRent(@RequestBody ReservationDto reservationDto) {
       purchaseReservationService.updatepurchaseRent(reservationDto);
       return new ResponseUtil(200,"Updated",null);
   }

   @DeleteMapping(params = {"resid"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deletepurchaseRent(@RequestParam String resid) {
       purchaseReservationService.deletepurchaseRent(resid);
       return new ResponseUtil(200, "Deleted", null);
   }

   @GetMapping(path = "{/resid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchReservationDto (@PathVariable String resid) {
       return new ResponseUtil(200,"OK",purchaseReservationService.searchReservationDto(resid));
   }
}
