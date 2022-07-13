package lk.ijse.spring.service;

import lk.ijse.spring.dto.GuestCustomerDto;

import java.util.List;

public interface GuestCustomerService {
    void saveGuestCustomer(GuestCustomerDto dto);

    void deleteGuestCustomer(String dto);

    void updateGuestCustomer(GuestCustomerDto dto);

    GuestCustomerDto searchGuestCustomer(String id);

    List<GuestCustomerDto> getAllGuestCustomer();
}
