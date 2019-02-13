package com.dts.demo_cinema.Domain.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team2_categories", schema = "booking_cinema", catalog = "")
public class CategoriesEntity {
    private int idCategory;
    private String nameType;
    private String description;

    @Id
    @Column(name = "id_category")
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "name_type")
    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesEntity that = (CategoriesEntity) o;
        return idCategory == that.idCategory &&
                Objects.equals(nameType, that.nameType) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategory, nameType, description);
    }
}
