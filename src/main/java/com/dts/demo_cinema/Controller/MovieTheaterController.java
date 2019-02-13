package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.*;
import com.dts.demo_cinema.Services.MTheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movietheater")
public class MovieTheaterController {
    @Autowired
    private MTheaterService mTheaterService;
    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse CreateMovieTheater(@RequestBody CreateMovietheater request){
        return  mTheaterService.CreateMovieTheater(request);
    }
    @PutMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse UpdateMovieTheater(@RequestBody UpdateMovieTheater request){
        return mTheaterService.UpdataMovieTheater(request);
    }
    @DeleteMapping(value = "/delete",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Reponse DeleteMovieTheater(@RequestBody DeleteMovieTheater request){
        return mTheaterService.DeleteMovieTheater(request);
    }
    @GetMapping(value = "/findAll", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MovietheaterEntity> findAll(){
        return mTheaterService.findAll();
    }
    @GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public MovietheaterEntity findById(@PathVariable("id") int id) {
        return mTheaterService.findById(id);
    }
    @GetMapping(value = "/findMovieTheater/{name_movietheater}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MovietheaterEntity> findMovieaTheaterByName(@PathVariable("name_movietheater") String name_movietheater) {
        return mTheaterService.findMovieaTheaterByNames(name_movietheater);
    }
    @GetMapping(value = "/findRoomByNameMoiveThearter/{name_movietheater}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MovieTheaterMappRoom> findRoomByMovieTheater(@PathVariable("name_movietheater") String name_movietheater) {
        return mTheaterService.findRoomBynameMovieTheater(name_movietheater);
    }
    @GetMapping(value = "/findAllRoom/{name_movietheater}/{id_movie}/{id_screen}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<RoomMappSecreenMovieTheaterMovie> findAllRoom(@PathVariable("name_movietheater") String name_movietheater, @PathVariable("id_movie") int id_movie, @PathVariable("id_screen") int id_screen) {
        return mTheaterService.findAllRoom(name_movietheater,id_movie,id_screen);
    }
    @GetMapping(value = "/findMovieByDate/{screening_start}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MappingMovie> finMovie(@PathVariable("screening_start") String screening_start) {
        return mTheaterService.findAllRoom(screening_start);
    }
}
