package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDto;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDto dto);

    void deleteDriver(String dto);

    void updateDriver(DriverDto dto);

    DriverDto searchDriver(String id);

    List<DriverDto> getAllDriver();
}
