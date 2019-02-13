package com.dts.demo_cinema.Domain.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
public class MovieRequest {
    @JsonProperty(value = "id_movie")
    private int idMovie;
    @JsonProperty(value = "name_movie")
    private String nameMovie;
    @JsonProperty(value = "description_movie")
    private String descriptionMovie;
    @JsonProperty(value = "trailer")
    private String trailer;
    @JsonProperty(value = "id_actor")
    private int idActor;
    @JsonProperty(value = "id_director")
    private int idDirector;
    @JsonProperty(value = "id_category")
    private int idCategory;
    @JsonProperty(value = "age_watch")
    private String ageWatch;
    @JsonProperty(value = "date_start")
    private String dateStart;
    @JsonProperty(value = "duration")
    private int duration;
    @JsonProperty(value = "language")
    private String language;

    @Override
    public String toString() {
        return "MovieRequest{" +
                "nameMovie='" + nameMovie + '\'' +
                ", descriptionMovie='" + descriptionMovie + '\'' +
                ", trailer='" + trailer + '\'' +
                ", idActor='" + idActor + '\'' +
                ", idDirector='" + idDirector + '\'' +
                ", idCategory='" + idCategory + '\'' +
                ", ageWatch='" + ageWatch + '\'' +
                ", dateStart=" + dateStart +
                ", duration=" + duration +
                ", language='" + language + '\'' +
                '}';
    }
}
