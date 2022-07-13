package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentDto;

import java.util.List;

public interface RentService {
    void saveRental(RentDto dto);

    void deleteRental(String dto);

    void updateRegRental(RentDto dto);

    RentDto searchRegRental(String id);

    List<RentDto> getAllRental();
}
