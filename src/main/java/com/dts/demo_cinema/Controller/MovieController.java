package com.dts.demo_cinema.Controller;

import com.dts.demo_cinema.Domain.Entity.MoviesEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.DeleteMovieRequest;
import com.dts.demo_cinema.Domain.Request.MovieRequest;
import com.dts.demo_cinema.Services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MoviesService moviesService;

    @PostMapping("/create")
    public String createMovie(@RequestBody MovieRequest request){
        moviesService.createMovie(request);
        return "OK";
    }

    @PutMapping("/update")
    public String updateMovie(@RequestBody MovieRequest request){
        moviesService.updateById(request);
        return "OK";
    }

    @DeleteMapping("/delete")
    public Reponse deleteMovie(@RequestBody DeleteMovieRequest request){
        return moviesService.deleteMovie(request);
    }

    @GetMapping("/findByMovieTheater/{id}")
    public List<MoviesEntity> findByMovieTheater(@PathVariable("id") Integer id){
        return moviesService.findByMovieTheater(id);
    }

    @GetMapping("/findByName/{name_movie}")
    public List<MoviesEntity> findByName(@PathVariable("name_movie") String name_movie){
        return moviesService.findByName(name_movie);
    }
}
