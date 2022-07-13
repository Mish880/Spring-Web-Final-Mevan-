package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@ToString
public class RegCustomer {
    @Id
    private String Regid;
    private String Regname;
    private String Regaddress;
    private String Regemail;
    private String Regcontact;
    private String RegNIC;

}
