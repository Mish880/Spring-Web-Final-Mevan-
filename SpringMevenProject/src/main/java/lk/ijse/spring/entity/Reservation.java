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
public class Reservation {
    @Id
    private String resid;
    private LocalDate date;
    private int noofdays;
    private String pickupdate;



    @ManyToOne
    @JoinColumn(name = "driverId",referencedColumnName = "Did",insertable = false,updatable = false)
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "vehicleId",referencedColumnName = "vid",insertable = false,updatable = false)
    private Vehicle vehicle;
}
