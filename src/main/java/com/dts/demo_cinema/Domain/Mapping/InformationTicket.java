package com.dts.demo_cinema.Domain.Mapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
public class InformationTicket {
  @JsonProperty(value = "id_ticket")
    private int idTicket;
    @JsonProperty(value = "id_screen")
    private int idScreen;
    @JsonProperty(value = "name_movie")
    private String nameMovie;
    @JsonProperty(value = "name_movietheater")
    private String nameMovieTheater;
    @JsonProperty(value = "time_create")
    private String timeCreate;
    @JsonProperty(value = "id_room")
    private int idRoom;
    @JsonProperty(value = "name_room")
    private String nameRoom;
    @JsonProperty(value = "row_seat")
    private String rowSeat;
    @JsonProperty(value = "number_seat")
    private int numberSeat;
    @JsonProperty(value = "price_ticket")
    private double priceTicket;

    public InformationTicket() {
    }

    public InformationTicket(int idTicket, int idScreen, String nameMovie, String nameMovieTheater, String timeCreate, int idRoom, String nameRoom, String rowSeat, int numberSeat, double priceTicket) {
        this.idTicket = idTicket;
        this.idScreen = idScreen;
        this.nameMovie = nameMovie;
        this.nameMovieTheater = nameMovieTheater;
        this.timeCreate = timeCreate;
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.rowSeat = rowSeat;
        this.numberSeat = numberSeat;
        this.priceTicket = priceTicket;
    }
}
