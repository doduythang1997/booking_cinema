package com.dts.demo_cinema.Domain.Entity;

import com.dts.demo_cinema.Domain.Mapping.InformationSeat;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_seat", schema = "booking_cinema", catalog = "")
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "InformationSeat",
                classes = @ConstructorResult(
                    targetClass = InformationSeat.class,
                        columns = {
                            @ColumnResult(name = "id_seat", type = Integer.class),
                                @ColumnResult(name = "id_room", type = Integer.class),
                                @ColumnResult(name = "name_room", type = String.class),
                                @ColumnResult(name = "id_screening", type = Integer.class),
                                @ColumnResult(name = "active", type = Integer.class),
                                @ColumnResult(name = "row_seat", type = String.class),
                                @ColumnResult(name = "number_seat", type = Integer.class)
                        }
                ))

)
public class SeatEntity {
    private int idSeat;
    private String rowSeat;
    private int numberSeat;
    private int idRoom;
    private int idScreening;
    private int active;

    @Id
    @Column(name = "id_seat")
    public int getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(int idSeat) {
        this.idSeat = idSeat;
    }

    @Basic
    @Column(name = "row_seat")
    public String getRowSeat() {
        return rowSeat;
    }

    public void setRowSeat(String rowSeat) {
        this.rowSeat = rowSeat;
    }

    @Basic
    @Column(name = "number_seat")
    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    @Basic
    @Column(name = "id_room")
    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    @Basic
    @Column(name = "id_screening")
    public int getIdScreening() {
        return idScreening;
    }

    public void setIdScreening(int idScreening) {
        this.idScreening = idScreening;
    }

    @Basic
    @Column(name = "active")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatEntity that = (SeatEntity) o;
        return idSeat == that.idSeat &&
                numberSeat == that.numberSeat &&
                idRoom == that.idRoom &&
                idScreening == that.idScreening &&
                active == that.active &&
                Objects.equals(rowSeat, that.rowSeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSeat, rowSeat, numberSeat, idRoom, idScreening, active);
    }
}
