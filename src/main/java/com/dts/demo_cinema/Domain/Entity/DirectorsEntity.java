package com.dts.demo_cinema.Domain.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_directors", schema = "booking_cinema", catalog = "")
public class DirectorsEntity {
    private int idDirector;
    private String name;
    private Integer born;
    private String career;

    @Id
    @Column(name = "id_director")
    public int getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(int idDirector) {
        this.idDirector = idDirector;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "born")
    public Integer getBorn() {
        return born;
    }

    public void setBorn(Integer born) {
        this.born = born;
    }

    @Basic
    @Column(name = "career")
    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DirectorsEntity that = (DirectorsEntity) o;
        return idDirector == that.idDirector &&
                Objects.equals(name, that.name) &&
                Objects.equals(born, that.born) &&
                Objects.equals(career, that.career);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDirector, name, born, career);
    }
}
