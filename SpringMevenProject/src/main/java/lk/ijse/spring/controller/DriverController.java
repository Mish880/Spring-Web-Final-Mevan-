package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDto;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllDrivers() { return new ResponseUtil(200,"ok",driverService.getAllDriver()); }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveDriver(@ModelAttribute DriverDto driver){
        driverService.saveDriver(driver);
        return new ResponseUtil(200,"Save",null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriver(@RequestBody DriverDto driver) {
        driverService.updateDriver(driver);
        return new ResponseUtil(200,"updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteDriver(@RequestParam String id) {
        driverService.deleteDriver(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchDriver(@PathVariable String id) {
        return new ResponseUtil(200,"ok",driverService.searchDriver(id));
    }
}
