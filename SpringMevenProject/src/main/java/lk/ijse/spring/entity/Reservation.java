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
    @Id
    private String Did;
    @Id
    private String vid;
    @Id
    private String Gueid;
    @Id
    private String Regid;

    private LocalDate date;
    private int noofdays;
    private String pickupdate;
   //Out=verse in driver
   @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
   @JoinColumn(name = "driverid",referencedColumnName = "Did",insertable = false,updatable = false)
   private Driver driver;

   //Out=verse in vehicle
   @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
   @JoinColumn(name = "vehicleid",referencedColumnName = "vid",insertable = false,updatable = false)
   private Vehicle vehicle;

   //Out=verse in guestcustomer
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "Guestid",referencedColumnName = "Gueid",insertable = false,updatable = false)
    private GuestCustomer guestCustomer;

    //Out=verse in regcustomer
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "registrationid",referencedColumnName = "regid",insertable = false,updatable = false)
    private RegCustomer regCustomer;

}
