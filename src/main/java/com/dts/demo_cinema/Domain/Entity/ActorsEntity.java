package com.dts.demo_cinema.Domain.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_actors", schema = "booking_cinema", catalog = "")
public class ActorsEntity {
    private int idActor;
    private String name;
    private Integer born;
    private String career;

    @Id
    @Column(name = "id_actor")
    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
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
        ActorsEntity that = (ActorsEntity) o;
        return idActor == that.idActor &&
                Objects.equals(name, that.name) &&
                Objects.equals(born, that.born) &&
                Objects.equals(career, that.career);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActor, name, born, career);
    }
}
