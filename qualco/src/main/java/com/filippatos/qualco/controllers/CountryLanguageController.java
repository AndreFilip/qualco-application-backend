package com.filippatos.qualco.controllers;

import com.filippatos.qualco.entities.Country;
import com.filippatos.qualco.entities.CountryLanguage;
import com.filippatos.qualco.repositories.CountryLanguageRepository;
import com.filippatos.qualco.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country-language")
@CrossOrigin(origins = "http://localhost:4200")
public class CountryLanguageController {

    @Autowired
    CountryLanguageRepository countryLanguageRepository;

    @GetMapping("/{countryId}")
    List<CountryLanguage> getCountriesLanguages(@PathVariable Integer countryId) {
        return this.countryLanguageRepository.findByCountryId(countryId);
    }

}
