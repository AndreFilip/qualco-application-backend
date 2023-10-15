package com.filippatos.qualco.services;

import com.filippatos.qualco.entities.Country;
import com.filippatos.qualco.entities.CountryStat;
import com.filippatos.qualco.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> findAllWithCountryStats() {
        List<Country> countriesResult = new ArrayList<>();

        List<Country> allCountries = this.countryRepository.findAllWithCountryStats();
        for (Country country : allCountries) {
            CountryStat countryStatMax = null;
            BigDecimal max = BigDecimal.valueOf(0);

            List<CountryStat> countryStats = country.getCountryStats();
            if (countryStats != null && countryStats.size() > 0) {
                for (CountryStat countryStat : countryStats) {
                    BigDecimal gdp = countryStat.getGdp();
                    Integer pop = countryStat.getPopulation();
                    BigDecimal ratio = gdp.divide(BigDecimal.valueOf(pop), MathContext.DECIMAL128);
                    if (ratio.compareTo(max) == 1) {
                        max = ratio;
                        countryStatMax = countryStat;
                    }
                }
            }
            List<CountryStat> countryStats2 = new ArrayList<>();
            countryStats2.add(countryStatMax);
            country.setCountryStats(countryStats2);
            countriesResult.add(country);
        }

        return countriesResult;
    }

}
