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
public class Rent {
    @Id
    private String rentid;
    private String paydate;
    private String damages;
    private double totalpay;
    private double paymethod;
    private double downpay;
}
