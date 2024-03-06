package com.burakkaya.odev3.business.abstracts;

import com.burakkaya.odev3.business.dto.WeatherAPIResponse;

public interface WeatherService {
    WeatherAPIResponse getWeatherDataDaily(String city);

    WeatherAPIResponse getWeatherDataWeekly(String city);

    WeatherAPIResponse getWeatherDataMonthly(String city);
}
