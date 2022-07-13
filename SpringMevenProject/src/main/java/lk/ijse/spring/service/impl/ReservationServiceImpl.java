package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ReservationDto;
import lk.ijse.spring.entity.Reservation;
import lk.ijse.spring.repo.ReservationRepo;
import lk.ijse.spring.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveReservation(ReservationDto dto) {
        if (!repo.existsById(dto.getResid())) {
            repo.save(mapper.map(dto, Reservation.class));
        } else {
            throw new RuntimeException("Reservation Already Exist..!");
        }

    }

    @Override
    public void deleteReservation(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Reservation ID.. No Such Reservation...!");
        }
    }

    @Override
    public void updateReservation(ReservationDto dto) {
        if (repo.existsById(dto.getResid())) {
            repo.save(mapper.map(dto, Reservation.class));
        } else {
            throw new RuntimeException("No Such Reservation To Update...! Please Check the Id..!");
        }
    }

    @Override
    public ReservationDto searchReservation(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), ReservationDto.class);
        } else {
            throw new RuntimeException("No Reservation For" + id + "..!");
        }
    }

    @Override
    public List<ReservationDto> getAllReservation() {
        return mapper.map(repo.findAll(), new TypeToken<List<ReservationDto>>() {

        }.getType());
    }
}
