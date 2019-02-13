package com.dts.demo_cinema.Domain.Mapping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InformationSeat {
    @JsonProperty(value = "id_seat")
    private int idSeat;
    @JsonProperty(value = "id_room")
    private int idRoom;
    @JsonProperty(value = "name_room")
    private String nameRoom;
    @JsonProperty(value = "id_screening")
    private int idScreening;
    @JsonProperty(value = "active")
    private int active;
    @JsonProperty(value = "row_seat")
    private String rowSeat;
    @JsonProperty(value = "number_seat")
    private int numberSeat;

    public InformationSeat() {
    }

    public InformationSeat(int idSeat, int idRoom, String nameRoom, int idScreening, int active, String rowSeat, int numberSeat) {
        this.idSeat = idSeat;
        this.idRoom = idRoom;
        this.nameRoom = nameRoom;
        this.idScreening = idScreening;
        this.active = active;
        this.rowSeat = rowSeat;
        this.numberSeat = numberSeat;
    }
}
