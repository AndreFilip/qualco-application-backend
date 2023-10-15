package com.filippatos.qualco.repositories;

import com.filippatos.qualco.entities.CountryLanguage;
import com.filippatos.qualco.entities.CountryLanguageId;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {

    @EntityGraph(attributePaths = {"language"})
    List<CountryLanguage> findByCountryId(Integer countryId);
}