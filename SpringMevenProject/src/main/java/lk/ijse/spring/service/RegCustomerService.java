package lk.ijse.spring.service;

import lk.ijse.spring.dto.RegCustomerDto;

import java.util.List;

public interface RegCustomerService {
    void saveRegCustomer(RegCustomerDto dto);

    void deleteRegCustomer(String dto);

    void updateRegCustomer(RegCustomerDto dto);

    RegCustomerDto searchRegCustomer(String id);

    List<RegCustomerDto> getAllRegCustomer();
}
