package com.filippatos.qualco.controllers;

import com.filippatos.qualco.entities.CountryStat;
import com.filippatos.qualco.repositories.CountryStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country-stats")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryStatController {

    @Autowired
    CountryStatRepository countryStatRepository;

    @GetMapping
    List<CountryStat> getAllCountryStats() {
        return this.countryStatRepository.findAllWithCountryRegionContintent();
    }
}
