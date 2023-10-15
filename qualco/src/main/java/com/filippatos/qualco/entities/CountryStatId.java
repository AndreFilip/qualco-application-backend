package com.filippatos.qualco.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class CountryStatId implements Serializable {
    private static final long serialVersionUID = -1003938110946207121L;
    @Column(name = "country_id", nullable = false)
    private Integer countryId;
    @Column(name = "year", nullable = false)
    private Integer year;

    @Override
    public int hashCode() {
        return Objects.hash(year, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CountryStatId entity = (CountryStatId) o;
        return Objects.equals(this.year, entity.year) &&
                Objects.equals(this.countryId, entity.countryId);
    }
}