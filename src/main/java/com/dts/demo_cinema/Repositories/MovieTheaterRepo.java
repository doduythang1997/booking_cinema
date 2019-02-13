package com.dts.demo_cinema.Repositories;

import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieTheaterRepo extends CrudRepository<MovietheaterEntity, Integer> {
    @Query(value = "select * from team2_movietheater where " +
            "team2_movietheater.name_movietheater like %:name_movietheater%",
            nativeQuery = true)
    List<MovietheaterEntity> FindMovietheaterByName(
            @Param("name_movietheater") String name_movietheater
    );
}
