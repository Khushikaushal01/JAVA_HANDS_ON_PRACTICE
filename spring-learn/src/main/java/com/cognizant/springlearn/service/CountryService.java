package com.cognizant.springlearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.springlearn.model.Country;
import java.util.ArrayList;

@Service
public class CountryService {

    @Autowired
    private ArrayList<Country> countryList;

    public Country getCountry(String code) {
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
