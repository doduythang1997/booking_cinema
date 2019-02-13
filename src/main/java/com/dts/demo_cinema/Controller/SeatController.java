package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Mapping.InformationSeat;
import com.dts.demo_cinema.Services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {
    @Autowired
    private SeatService seatService;

    @GetMapping("/find/{id}")
    public List<InformationSeat> findStatusSeat(@PathVariable("id") Integer id_room){
        return seatService.findSeat(id_room);
    }

}
