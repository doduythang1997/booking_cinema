package com.dts.demo_cinema.Domain.Entity;

import com.dts.demo_cinema.Domain.Request.MappingMovie;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_screening", schema = "booking_cinema", catalog = "")
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "MappingMovie",
                classes = @ConstructorResult(
                        targetClass = MappingMovie.class,
                        columns = {
                                @ColumnResult(name = "name_movie", type = String.class),
                                @ColumnResult(name = "description_movie", type = String.class),
                                @ColumnResult(name = "trailer", type = String.class),
                                @ColumnResult(name = "age_watch", type = String.class),
                                @ColumnResult(name = "date_start", type = String.class),
                                @ColumnResult(name = "duration", type = int.class),
                                @ColumnResult(name = "image_movie", type = String.class),
                                @ColumnResult(name = "language", type = String.class)
                        }
                ))
)
public class ScreeningEntity {
    private int idScreen;
    private int idMovie;
    private int idRoom;
    private String screeningStart;

    @Id
    @Column(name = "id_screen")
    public int getIdScreen() {
        return idScreen;
    }

    public void setIdScreen(int idScreen) {
        this.idScreen = idScreen;
    }

    @Basic
    @Column(name = "id_movie")
    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
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
    @Column(name = "screening_start")
    public String getScreeningStart() {
        return screeningStart;
    }

    public void setScreeningStart(String screeningStart) {
        this.screeningStart = screeningStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScreeningEntity that = (ScreeningEntity) o;
        return idScreen == that.idScreen &&
                idMovie == that.idMovie &&
                idRoom == that.idRoom &&
                Objects.equals(screeningStart, that.screeningStart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idScreen, idMovie, idRoom, screeningStart);
    }
}
