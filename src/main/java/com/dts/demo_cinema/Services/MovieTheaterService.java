package com.dts.demo_cinema.Services;

import com.dts.demo_cinema.Domain.Entity.MovietheaterEntity;
import com.dts.demo_cinema.Domain.Reponse.Reponse;

import com.dts.demo_cinema.Domain.Request.CreateMovietheater;
import com.dts.demo_cinema.Domain.Request.DeleteMovieTheater;
import com.dts.demo_cinema.Domain.Request.UpdateMovieTheater;

public interface MovieTheaterService extends BaseMovieTheaterService<MovietheaterEntity> {
Reponse CreateMovieTheater(CreateMovietheater request);
Reponse DeleteMovieTheater(DeleteMovieTheater request);
Reponse UpdataMovieTheater(UpdateMovieTheater request);
}
