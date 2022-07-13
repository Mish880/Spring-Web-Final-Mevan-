package lk.ijse.spring.service;

import lk.ijse.spring.dto.ReservationDto;

import java.util.List;

public interface ReservationService {
    void saveReservation(ReservationDto dto);

    void deleteReservation(String dto);

    void updateReservation(ReservationDto dto);

    ReservationDto searchReservation(String id);

    List<ReservationDto> getAllReservation();
}
