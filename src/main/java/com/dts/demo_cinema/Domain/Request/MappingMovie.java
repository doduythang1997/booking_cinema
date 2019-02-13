package com.dts.demo_cinema.Domain.Request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MappingMovie {
    private String name_movie;
    private String description_movie;
    private String trailer;
    private String age_watch;
    private String date_start;
    private int duration;
    private String image_movie;
    private String language;

    public MappingMovie() {
    }

    public MappingMovie(String name_movie, String description_movie, String trailer, String age_watch, String date_start, int duration, String image_movie, String language) {
        this.name_movie = name_movie;
        this.description_movie = description_movie;
        this.trailer = trailer;
        this.age_watch = age_watch;
        this.date_start = date_start;
        this.duration = duration;
        this.image_movie = image_movie;
        this.language = language;
    }
}
