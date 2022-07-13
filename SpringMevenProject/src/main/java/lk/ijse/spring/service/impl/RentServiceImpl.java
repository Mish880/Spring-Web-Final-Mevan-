package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDto;
import lk.ijse.spring.entity.Rent;
import lk.ijse.spring.repo.RegCustomerRepo;
import lk.ijse.spring.repo.RentRepo;
import lk.ijse.spring.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRental(RentDto dto) {
     if (!repo.existsById(dto.getRentid())) {
         repo.save(mapper.map(dto,Rent.class));
      }
    }

    @Override
    public void deleteRental(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Rent ID.. No Such Rent..!");
        }
    }

    @Override
    public void updateRegRental(RentDto dto) {
        if (repo.existsById(dto.getRentid())) {
            repo.save(mapper.map(dto,Rent.class));
        } else {
            throw new RuntimeException("No Such Rent To Update...! Pleace the Rent ID..!");
        }
    }

    @Override
    public RentDto searchRegRental(String id) {
        if (repo.existsById(id)){
            return mapper.map(repo.findById(id).get(),RentDto.class);
        } else {
            throw new RuntimeException("No Rent For" + id +"..!");
        }
    }

    @Override
    public List<RentDto> getAllRental() {
       return mapper.map(repo.findAll(),new TypeToken<List<RentDto>>(){

       }.getType());
    }
}
