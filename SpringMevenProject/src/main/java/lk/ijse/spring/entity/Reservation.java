package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@ToString
@IdClass(Orderdriver_PK.class)



public class Reservation {

    @Id
    private String resid;
    private String Did;
    private String vid;
    private String Gueid;
    private String Regid;
    private LocalDate date;
    private int noofdays;
    private String pickupdate;
    //Out=verse in driver
    @ManyToOne
    @JoinColumn(name = "driverid", referencedColumnName = "Did", insertable = false, updatable = false)
    private Driver driver;

    //Out=verse in vehicle
    @ManyToOne
    @JoinColumn(name = "vehicleid", referencedColumnName = "vid", insertable = false, updatable = false)
    private Vehicle vehicle;

    //Out=verse in guestcustomer
    @ManyToOne
    @JoinColumn(name = "Guestid", referencedColumnName = "Gueid", insertable = false, updatable = false)
    private GuestCustomer guestCustomer;

    //Out=verse in regcustomer
    @ManyToOne
    @JoinColumn(name = "registrationid", referencedColumnName = "regid", insertable = false, updatable = false)
    private RegCustomer regCustomer;


}
