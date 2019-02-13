package com.dts.demo_cinema.Domain.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeleteRoom {
    @JsonProperty(value = "id_room")
    private int idRoom;
}
