package lk.ijse.spring.service;

import lk.ijse.spring.dto.VehicleDto;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDto dto);

    void deleteVehicle(String dto);

    void updateVehicle(VehicleDto dto);

    VehicleDto searchVehicle(String id);

    List<VehicleDto> getAllVehicle();
}
