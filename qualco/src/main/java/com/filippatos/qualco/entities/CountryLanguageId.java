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
public class CountryLanguageId implements Serializable {
    private static final long serialVersionUID = 8644744121516612048L;
    @Column(name = "country_id", nullable = false)
    private Integer countryId;
    @Column(name = "language_id", nullable = false)
    private Integer languageId;

    @Override
    public int hashCode() {
        return Objects.hash(languageId, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CountryLanguageId entity = (CountryLanguageId) o;
        return Objects.equals(this.languageId, entity.languageId) &&
                Objects.equals(this.countryId, entity.countryId);
    }
}