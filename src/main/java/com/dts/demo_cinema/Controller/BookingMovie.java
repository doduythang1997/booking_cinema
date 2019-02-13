package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Entity.MoviesEntity;
import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import com.dts.demo_cinema.Domain.Mapping.InformationSeat;
import com.dts.demo_cinema.Domain.Mapping.InformationTicket;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.RoomMappSecreenMovieTheaterMovie;
import com.dts.demo_cinema.Services.BookingService;
import com.dts.demo_cinema.Services.MTheaterService;
import com.dts.demo_cinema.Services.MoviesService;
import com.dts.demo_cinema.Services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingMovie {
    @Autowired
    private BookingService bookingService;

    @Autowired
    private MoviesService moviesService;

    @Autowired
    private MTheaterService mTheaterService;

    @Autowired
    private SeatService seatService;

    @GetMapping(value = "/inforticket/{id_ticket}")
    public List<InformationTicket> getInforTicket(@PathVariable("id_ticket") Integer id_ticket){
        return bookingService.getInforTicket(id_ticket);
    }

    @GetMapping(value = "/findmovietheater/{name_movietheater}")
    public List<MovietheaterEntity> findMovieTheater(@PathVariable("name_movietheater") String name_movietheater){
        return mTheaterService.findMovieaTheaterByNames(name_movietheater);
    }

    @GetMapping("/findmoviebymovietheater/{id_movietheater}")
    public List<MoviesEntity> findMovie(@PathVariable("id_movietheater") Integer id_movietheater){
        return moviesService.findByMovieTheater(id_movietheater);
    }

    @GetMapping("/findByRoom/{name_movietheater}/{id_movie}/{id_screen}")
    public List<RoomMappSecreenMovieTheaterMovie> findRoom(@PathVariable("name_movietheater") String name_movietheater,
                                                           @PathVariable("id_movie") int id_movie,
                                                           @PathVariable("id_screen") int id_screen){
        return mTheaterService.findAllRoom(name_movietheater,id_movie,id_screen);
    }

    @GetMapping("/InforSeatInRoom/{id_room}")
    public List<InformationSeat> findInforSeat(@PathVariable("id_room") Integer id_room){
        return seatService.findSeat(id_room);
    }

//    @PostMapping("/createTicket/{id_seat}")
//    public String createTicket(@PathVariable("id_seat") Integer id_seat, @RequestBody CreateTicketRequest request){
//         bookingService.createTicket(id_seat, request);
//         return "OK";
//    }
}
