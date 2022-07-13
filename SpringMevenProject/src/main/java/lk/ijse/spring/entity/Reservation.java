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
public class Reservation {
    @Id
    private String resid;
    private String resdate;
    private String returndate;
    private int noofdays;
    private String canceldetail;
    private String pickupdate;
}
