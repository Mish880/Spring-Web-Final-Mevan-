package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class RentDto {
    private String rentid;
    private String paydate;
    private String damages;
    private double totalpay;
    private double paymethod;
    private double downpay;
}
