package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class RegCustomerDto {
    private String Regid;
    private String Regname;
    private String Regaddress;
    private String Regemail;
    private String Regcontact;
    private String RegNIC;
}
