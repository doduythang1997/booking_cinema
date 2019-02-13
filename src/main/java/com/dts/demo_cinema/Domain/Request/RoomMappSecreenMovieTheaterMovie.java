package com.dts.demo_cinema.Domain.Request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RoomMappSecreenMovieTheaterMovie {
    private String name_movie;
    private String name_movietheater;
    private String name_room;
    private int seat_no;

    public RoomMappSecreenMovieTheaterMovie() {
    }

    public RoomMappSecreenMovieTheaterMovie(String name_movie, String name_movietheater, String name_room, int seat_no) {
        this.name_movie = name_movie;
        this.name_movietheater = name_movietheater;
        this.name_room = name_room;
        this.seat_no = seat_no;
    }
}
