package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Entity.MoviesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieRepositoryInterface extends JpaRepository<MoviesEntity, Integer> {
    @Query(value = "select * from team2_movies a where name_movie like %:name_movie%", nativeQuery = true)
    List<MoviesEntity> findByName(
            @Param("name_movie") String name_movie
    );

    @Query(value = "select * from team2_movietheater a inner join team2_screening b on" +
            " a.id_screen = b.id_screen inner join team2_movies c on " +
            " b.id_movie = c.id_movie where a.id_movietheater = :id_movietheater", nativeQuery = true)
    List<MoviesEntity> findByMovieTheater(
            @Param("id_movietheater") Integer id_movietheater
    );

    @Query(value = "select * from team2_movietheater a inner join team2_screening b on" +
            " a.id_screen = b.id_screen inner join team2_movies c on" +
            " b.id_movie = c.id_movie where b.screening_start > :time_from and" +
            " b.screening_start <:time_to", nativeQuery = true)
    List<MoviesEntity> findByTimeStart(
            @Param("time_from") Integer time_from ,
            @Param("time_to" ) Integer time_to
    );

}
