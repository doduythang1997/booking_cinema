package com.dts.demo_cinema.Domain.Entity;

import com.dts.demo_cinema.Domain.Mapping.InformationTicket;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_ticket", schema = "booking_cinema", catalog = "")
@SqlResultSetMappings(
//        {
        @SqlResultSetMapping(name = "InformationTicket",
                classes = @ConstructorResult(
                targetClass = InformationTicket.class,
                columns = {
                        @ColumnResult(name = "id_ticket", type = Integer.class),
                        @ColumnResult(name = "id_screen", type = Integer.class),
                        @ColumnResult(name = "name_movie", type = String.class),
                        @ColumnResult(name = "name_movietheater", type = String.class),
                        @ColumnResult(name = "time_create", type = String.class),
                        @ColumnResult(name = "id_room", type = Integer.class),
                        @ColumnResult(name = "name_room", type = String.class),
                        @ColumnResult(name = "row_seat", type = String.class),
                        @ColumnResult(name = "number_seat", type = Integer.class),
                        @ColumnResult(name = "price_ticket", type = Double.class)
                }
        ))


//        @SqlResultSetMapping(name = "BookingTicket",
//                classes = @ConstructorResult(
//                targetClass = BookingTicket.class,
//                columns = {
//                        @ColumnResult(name = "id_ticket",type = Integer.class),
//                        @ColumnResult(name = "id_movietheater", type = Integer.class),
//                        @ColumnResult(name = "id_movie", type = Integer.class),
//                        @ColumnResult(name = "id_screen", type = Integer.class),
//                        @ColumnResult(name = "id_room", type = Integer.class),
//                        @ColumnResult(name = "id_seat", type = Integer.class),
//                        @ColumnResult(name = "time_create", type = String.class)
//                }
//        ))
//        }
)

public class TicketEntity {
    private int idTicket;
    private int idScreen;
    private double priceTicket;
    private String timeCreate;

    @Id
    @Column(name = "id_ticket")
    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    @Basic
    @Column(name = "id_screen")
    public int getIdScreen() {
        return idScreen;
    }

    public void setIdScreen(int idScreen) {
        this.idScreen = idScreen;
    }

    @Basic
    @Column(name = "price_ticket")
    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    @Basic
    @Column(name = "time_create")
    public String getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(String timeCreate) {
        this.timeCreate = timeCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketEntity that = (TicketEntity) o;
        return idTicket == that.idTicket &&
                idScreen == that.idScreen &&
                Double.compare(that.priceTicket, priceTicket) == 0 &&
                Objects.equals(timeCreate, that.timeCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTicket, idScreen, priceTicket, timeCreate);
    }
}
