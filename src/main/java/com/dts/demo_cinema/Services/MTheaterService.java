package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;
import com.dts.demo_cinema.Domain.Request.*;
import com.dts.demo_cinema.Repositories.FindReponsitories;
import com.dts.demo_cinema.Repositories.MovieTheaterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MTheaterService implements MovieTheaterService {
    @Autowired
    private MovieTheaterRepo movieTheaterRepo;
    @Autowired
    private FindReponsitories findReponsitories;
    @Override
    public void save(MovietheaterEntity movietheaterEntity) {
        movieTheaterRepo.save(movietheaterEntity);
    }

    @Override
    public Reponse CreateMovieTheater(CreateMovietheater request) {
        Reponse reponse=new Reponse();
        try {
            MovietheaterEntity movietheaterEntity = new MovietheaterEntity();
            movietheaterEntity.setIdMovietheater(request.getIdMovietheater());
            movietheaterEntity.setAddress(request.getAddress());
            movietheaterEntity.setIdScreen(request.getIdScreen());
            movietheaterEntity.setImageMovietheater(request.getImageMovietheater());
            movietheaterEntity.setNameMovietheater(request.getNameMovietheater());
            save(movietheaterEntity);
        }catch (Exception e){
            reponse.server_err();
        }
        return reponse;
    }

    @Override
    public Reponse DeleteMovieTheater(DeleteMovieTheater request) {
        Reponse rs=new Reponse();
        try {
            MovietheaterEntity movietheaterEntity=findById(request.getIdMovietheater());
           if(movietheaterEntity!=null){
                movieTheaterRepo.delete(movietheaterEntity);
           }
        }catch (Exception e){
            rs.server_err();
        }
        return rs;
    }

    @Override
    public Reponse UpdataMovieTheater(UpdateMovieTheater request) {
        Reponse re=new Reponse();
        try{
            MovietheaterEntity movietheaterEntity=findById(request.getIdMovietheater());
            if(movietheaterEntity!=null){
                movietheaterEntity.setNameMovietheater(request.getNameMovietheater());
                movietheaterEntity.setIdScreen(request.getIdScreen());
                movietheaterEntity.setAddress(request.getAddress());
                movietheaterEntity.setImageMovietheater(request.getImageMovietheater());
                save(movietheaterEntity);
            }
        }catch (Exception e){
            re.server_err();
        }
        return re;
    }

    @Override
    public List<MovietheaterEntity> findAll() {
        return (List<MovietheaterEntity>) movieTheaterRepo.findAll();
}

    @Override
    public MovietheaterEntity findById(Integer id) {
        Optional<MovietheaterEntity> optional=movieTheaterRepo.findById(id);
        if(optional.isPresent())
            return optional.get();
        return null;
    }
    public List<MovietheaterEntity> findMovieaTheaterByNames(String name_movietheater){
    return movieTheaterRepo.FindMovietheaterByName(name_movietheater);
    }
    public List<MovieTheaterMappRoom> findRoomBynameMovieTheater(String name_movietheater){
        return findReponsitories.FindRoomByNameMovieTheater(name_movietheater);
    }
    public List<RoomMappSecreenMovieTheaterMovie> findAllRoom(String name_movietheater,int id_movie,int id_screen){
        return findReponsitories.findAllRoomByMovie(name_movietheater,id_movie,id_screen);
    }
    public List<MappingMovie> findAllRoom(String screening_start){
        return findReponsitories.findMovieByDate(screening_start);
    }
}
