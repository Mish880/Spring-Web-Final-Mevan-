package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class GuestCustomerDto {
    private String Gueid;
    private String Guename;
    private String Guewaddress;
    private String GueNIC;
    private String Gueemail;
    private String Guecontact;
}
