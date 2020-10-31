package com.cyber.services.carpet;

import com.cyber.enums.City;
import com.cyber.interfaces.carpetPrice.Carpet;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CarpetTX implements Carpet {
    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static {
        sqPriceForCity.put(City.AUSTIN, new BigDecimal("3.32"));
        sqPriceForCity.put(City.SANANTONIO, new BigDecimal("1.92"));
        sqPriceForCity.put(City.HOUSTON, new BigDecimal("1.35"));
    }


    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;


        Optional<Map.Entry<City, BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();


        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}