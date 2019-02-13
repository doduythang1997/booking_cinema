package com.dts.demo_cinema.Domain.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeleteMovieTheater {
    @JsonProperty(value = "id_movietheater")
    private int idMovietheater;

    public DeleteMovieTheater() {
    }

    public DeleteMovieTheater(int idMovietheater) {
        this.idMovietheater = idMovietheater;
    }
}
