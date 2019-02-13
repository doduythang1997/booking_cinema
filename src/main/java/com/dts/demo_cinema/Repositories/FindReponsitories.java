package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Request.MappingMovie;
import com.dts.demo_cinema.Domain.Request.MovieTheaterMappRoom;
import com.dts.demo_cinema.Domain.Request.RoomMappSecreenMovieTheaterMovie;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class FindReponsitories extends BaseRepository {
    //find room all by rạp
    public List<MovieTheaterMappRoom> FindRoomByNameMovieTheater(String name_movietheater){
        List<MovieTheaterMappRoom> movie= null;
        String sql = "select team2_movietheater.name_movietheater, team2_room.name_room,team2_room.seat_no" +
                " from team2_movietheater inner join " +
                "team2_screening inner join team2_room" +
                " on team2_movietheater.id_screen=team2_screening.id_screen " +
                "and team2_screening.id_room=team2_room.id_room " +
                "where team2_movietheater.name_movietheater like '%"+name_movietheater+"%'";
        Query query = entityManager.createNativeQuery(sql, "MovieTheaterMappRoom");
        movie = query.getResultList();
        return movie;

    }
    //find room all by film
    public List<RoomMappSecreenMovieTheaterMovie> findAllRoomByMovie(String name_movietheater,int id_movie,int id_screen ){
        List<RoomMappSecreenMovieTheaterMovie> find= null;
        String sql = "select team2_movies.name_movie, team2_movietheater.name_movietheater" +
                ",team2_room.name_room,team2_room.seat_no from team2_movies inner join" +
                " team2_screening inner join team2_movietheater inner join " +
                "team2_room on team2_movies.id_movie=team2_screening.id_movie and " +
                "team2_screening.id_screen=team2_movietheater.id_screen and " +
                "team2_screening.id_room=team2_room.id_room where " +
                "team2_movietheater.name_movietheater like '%"+name_movietheater+"%' and " +
                "team2_movies.id_movie='"+id_movie+"'and team2_screening.id_screen='"+id_screen+"'";
        Query query = entityManager.createNativeQuery(sql, "RoomMappSecreenMovieTheaterMovie");
        find = query.getResultList();
        return find;

    }
    //find movie by ngay chieu
    public List<MappingMovie> findMovieByDate(String screening_start){
        List<MappingMovie> find= null;
        String sql = "select team2_movies.name_movie,team2_movies.description_movie,team2_movies.trailer,team2_movies.age_watch,team2_movies.date_start," +
                " team2_movies.duration,team2_movies.image_movie," +
                "team2_movies.language from team2_movies inner join" +
                " team2_screening on team2_movies.id_movie=team2_screening.id_room " +
                "where team2_screening.screening_start ='"+screening_start+"'";
        Query query = entityManager.createNativeQuery(sql, "MappingMovie");
        find = query.getResultList();
        return find;

    }
}
