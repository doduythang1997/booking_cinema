package com.dts.demo_cinema.Domain.Request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MovieTheaterMappRoom {
    private String name_movietheater;
    private String name_room;
    private int seat_no;

    public MovieTheaterMappRoom() {
    }

    public MovieTheaterMappRoom(String name_movietheater, String name_room, int seat_no) {
        this.name_movietheater = name_movietheater;
        this.name_room = name_room;
        this.seat_no = seat_no;
    }
}
