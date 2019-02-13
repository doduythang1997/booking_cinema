package com.dts.demo_cinema.Domain.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_movies", schema = "booking_cinema", catalog = "")
public class MoviesEntity {
    private int idMovie;
    private String nameMovie;
    private String descriptionMovie;
    private String trailer;
    private int idActor;
    private int idDirector;
    private int idCategory;
    private String ageWatch;
    private String dateStart;
    private int duration;
    private String imageMovie;
    private String language;

    @Id
    @Column(name = "id_movie")
    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    @Basic
    @Column(name = "name_movie")
    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    @Basic
    @Column(name = "description_movie")
    public String getDescriptionMovie() {
        return descriptionMovie;
    }

    public void setDescriptionMovie(String descriptionMovie) {
        this.descriptionMovie = descriptionMovie;
    }

    @Basic
    @Column(name = "trailer")
    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Basic
    @Column(name = "id_actor")
    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
    }

    @Basic
    @Column(name = "id_director")
    public int getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    @Basic
    @Column(name = "id_category")
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "age_watch")
    public String getAgeWatch() {
        return ageWatch;
    }

    public void setAgeWatch(String ageWatch) {
        this.ageWatch = ageWatch;
    }

    @Basic
    @Column(name = "date_start")
    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "image_movie")
    public String getImageMovie() {
        return imageMovie;
    }

    public void setImageMovie(String imageMovie) {
        this.imageMovie = imageMovie;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoviesEntity that = (MoviesEntity) o;
        return idMovie == that.idMovie &&
                idActor == that.idActor &&
                idDirector == that.idDirector &&
                idCategory == that.idCategory &&
                duration == that.duration &&
                Objects.equals(nameMovie, that.nameMovie) &&
                Objects.equals(descriptionMovie, that.descriptionMovie) &&
                Objects.equals(trailer, that.trailer) &&
                Objects.equals(ageWatch, that.ageWatch) &&
                Objects.equals(dateStart, that.dateStart) &&
                Objects.equals(imageMovie, that.imageMovie) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMovie, nameMovie, descriptionMovie, trailer, idActor, idDirector, idCategory, ageWatch, dateStart, duration, imageMovie, language);
    }
}
