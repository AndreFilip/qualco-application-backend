package com.filippatos.qualco.controllers;

import com.filippatos.qualco.entities.Country;
import com.filippatos.qualco.repositories.CountryRepository;
import com.filippatos.qualco.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {

    @Autowired
    CountryService countryService;

    @Autowired
    CountryRepository countryRepository;

    @GetMapping
    List<Country> getCountries() {
        return this.countryRepository.findAll();
    }

    @GetMapping("/findAllWithCountryStats")
    List<Country> findAllWithCountryStats() {
        return this.countryService.findAllWithCountryStats();
    }

}
