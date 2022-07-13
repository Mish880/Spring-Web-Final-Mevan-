package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ReservationDto {
    private String resid;
    private String resdate;
    private String returndate;
    private int noofdays;
    private String canceldetail;
    private String pickupdate;
}

