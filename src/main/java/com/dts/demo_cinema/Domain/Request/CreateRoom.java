package com.dts.demo_cinema.Domain.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CreateRoom {
    @JsonProperty(value = "id_room")
    private int idRoom;
    @JsonProperty(value = "name_room")
    private String nameRoom;
    @JsonProperty(value = "seat_no")
    private int seatNo;
}
