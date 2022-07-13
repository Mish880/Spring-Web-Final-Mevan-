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
public class GuestCustomer {
    @Id
    private String Gueid;
    private String Guename;
    private String Guewaddress;
    private String GueNIC;
    private String Gueemail;
    private String Guecontact;

}
