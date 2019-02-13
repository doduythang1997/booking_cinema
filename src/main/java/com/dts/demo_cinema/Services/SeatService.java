package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Mapping.InformationSeat;
import com.dts.demo_cinema.Repositories.SeatCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatCustomRepository seatCustomRepository;

    public List<InformationSeat> findSeat(Integer idRoom){
        return seatCustomRepository.findAllSeatByRoom(idRoom);
    }

}
