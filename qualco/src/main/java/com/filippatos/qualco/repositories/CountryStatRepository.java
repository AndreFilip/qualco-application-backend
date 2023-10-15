package com.filippatos.qualco.repositories;

import com.filippatos.qualco.entities.CountryStat;
import com.filippatos.qualco.entities.CountryStatId;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryStatRepository extends JpaRepository<CountryStat, CountryStatId> {

    @EntityGraph(attributePaths = {"country.region.continent"})
    @Query("SELECT cs FROM CountryStat cs")
    List<CountryStat> findAllWithCountryRegionContintent();
}