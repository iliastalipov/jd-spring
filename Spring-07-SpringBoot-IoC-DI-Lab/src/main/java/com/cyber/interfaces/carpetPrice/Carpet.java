package com.cyber.interfaces.carpetPrice;

import com.cyber.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}
