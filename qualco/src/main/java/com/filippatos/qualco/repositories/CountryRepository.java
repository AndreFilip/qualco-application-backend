package com.filippatos.qualco.repositories;

import com.filippatos.qualco.entities.Country;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    @EntityGraph(attributePaths = {"countryStats"})
    @Query("SELECT c FROM Country c")
    List<Country> findAllWithCountryStats();
}