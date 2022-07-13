package lk.ijse.spring.repo;

import lk.ijse.spring.entity.RegCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegCustomerRepo extends JpaRepository<RegCustomer, String> {
}
