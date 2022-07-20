package lk.ijse.spring.service;

import lk.ijse.spring.dto.ReservationDto;

import java.util.List;

public interface PurchaseReservationService {
    void purchaseReservation(ReservationDto dto);
    void deletepurchaseRent(String resid);
    void updatepurchaseRent(ReservationDto dto);
    ReservationDto searchReservationDto(String dto);
    List<ReservationDto> getAllPurchaseRes();
}
