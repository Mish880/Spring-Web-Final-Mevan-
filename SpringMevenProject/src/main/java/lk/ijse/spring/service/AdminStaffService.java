package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminStaffDto;

import java.util.List;

public interface AdminStaffService {
    void saveAdmin(AdminStaffDto dto);

    void deleteAdmin(String dto);

    void updateAdmin(AdminStaffDto dto);

    AdminStaffDto searchAdmin(String id);

    List<AdminStaffDto> getAllAdmin();
}
