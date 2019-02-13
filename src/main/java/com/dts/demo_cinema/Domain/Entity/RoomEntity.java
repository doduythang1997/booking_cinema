package com.dts.demo_cinema.Domain.Entity;

import com.dts.demo_cinema.Domain.Request.MovieTheaterMappRoom;
import com.dts.demo_cinema.Domain.Request.RoomMappSecreenMovieTheaterMovie;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_room", schema = "booking_cinema", catalog = "")
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "RoomMappSecreenMovieTheaterMovie",
                classes = @ConstructorResult(
                        targetClass = RoomMappSecreenMovieTheaterMovie.class,
                        columns = {
                                @ColumnResult(name = "name_movie", type = String.class),
                                @ColumnResult(name = "name_movietheater", type = String.class),
                                @ColumnResult(name = "name_room", type = String.class),
                                @ColumnResult(name = "seat_no", type = int.class)
                        }
                ))
)
public class RoomEntity {
    @JsonProperty(value = "id_room")
    private int idRoom;
    @JsonProperty(value = "name_room")
    private String nameRoom;
    @JsonProperty(value = "seat_no")
    private int seatNo;

    @Id
    @Column(name = "id_room")
    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    @Basic
    @Column(name = "name_room")
    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    @Basic
    @Column(name = "seat_no")
    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomEntity that = (RoomEntity) o;
        return idRoom == that.idRoom &&
                seatNo == that.seatNo &&
                Objects.equals(nameRoom, that.nameRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRoom, nameRoom, seatNo);
    }
}
