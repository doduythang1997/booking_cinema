package com.dts.demo_cinema.Domain.Entity;

import com.dts.demo_cinema.Domain.Request.MovieTheaterMappRoom;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_movietheater", schema = "booking_cinema", catalog = "")
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "MovieTheaterMappRoom",
                classes = @ConstructorResult(
                        targetClass = MovieTheaterMappRoom.class,
                        columns = {
                                @ColumnResult(name = "name_movietheater", type = String.class),
                                @ColumnResult(name = "name_room", type = String.class),
                                @ColumnResult(name = "seat_no", type = int.class)
                        }
                ))
)
public class MovietheaterEntity {
    @JsonProperty(value = "id_movietheater")
    private int idMovietheater;
    @JsonProperty(value = "id_screen")
    private int idScreen;
    @JsonProperty(value = "image_movietheater")
    private String imageMovietheater;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value = "name_movietheater")
    private String nameMovietheater;

    @Id
    @Column(name = "id_movietheater")
    public int getIdMovietheater() {
        return idMovietheater;
    }

    public void setIdMovietheater(int idMovietheater) {
        this.idMovietheater = idMovietheater;
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
    @Column(name = "image_movietheater")
    public String getImageMovietheater() {
        return imageMovietheater;
    }

    public void setImageMovietheater(String imageMovietheater) {
        this.imageMovietheater = imageMovietheater;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "name_movietheater")
    public String getNameMovietheater() {
        return nameMovietheater;
    }

    public void setNameMovietheater(String nameMovietheater) {
        this.nameMovietheater = nameMovietheater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovietheaterEntity that = (MovietheaterEntity) o;
        return idMovietheater == that.idMovietheater &&
                idScreen == that.idScreen &&
                Objects.equals(imageMovietheater, that.imageMovietheater) &&
                Objects.equals(address, that.address) &&
                Objects.equals(nameMovietheater, that.nameMovietheater);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMovietheater, idScreen, imageMovietheater, address, nameMovietheater);
    }
}
