package com.burakkaya.odev3.business.abstracts;

import com.burakkaya.odev3.business.dto.WeatherAPIResponse;

public interface WeatherAPIService {
    WeatherAPIResponse makeADailyRequest(String city);

    WeatherAPIResponse makeAWeeklyRequest(String city);

    WeatherAPIResponse makeAMonthlyRequest(String city);
}
