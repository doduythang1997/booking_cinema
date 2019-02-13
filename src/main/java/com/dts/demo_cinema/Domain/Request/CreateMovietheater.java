package com.dts.demo_cinema.Domain.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class CreateMovietheater {
    @JsonProperty(value = "id_movietheater")
    private int idMovietheater;
    @JsonProperty(value = "id_screen")
    private int idScreen;
    @JsonProperty(value = "image_movietheater")
    private String imageMovietheater;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value = "name_movietheater")
    private String nameMovietheater;
}
