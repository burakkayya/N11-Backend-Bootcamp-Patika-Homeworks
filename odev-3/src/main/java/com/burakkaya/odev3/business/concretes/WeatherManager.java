package com.burakkaya.odev3.business.concretes;

import com.burakkaya.odev3.business.abstracts.WeatherAPIService;
import com.burakkaya.odev3.business.abstracts.WeatherService;
import com.burakkaya.odev3.business.dto.WeatherAPIResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class WeatherManager implements WeatherService {

    private final WeatherAPIService weatherAPIService;
    private final ModelMapper modelMapper;

    @Override
    public WeatherAPIResponse getWeatherDataDaily(String city) {
        WeatherAPIResponse weatherAPIResponse = weatherAPIService.makeADailyRequest(city);
        WeatherAPIResponse response = modelMapper.map(weatherAPIResponse, WeatherAPIResponse.class);
        return response;
    }

    @Override
    public WeatherAPIResponse getWeatherDataWeekly(String city) {
        WeatherAPIResponse weatherAPIResponse = weatherAPIService.makeAWeeklyRequest(city);
        WeatherAPIResponse response = modelMapper.map(weatherAPIResponse, WeatherAPIResponse.class);
        return response;
    }

    @Override
    public WeatherAPIResponse getWeatherDataMonthly(String city) {
        WeatherAPIResponse weatherAPIResponse = weatherAPIService.makeAMonthlyRequest(city);
        WeatherAPIResponse response = modelMapper.map(weatherAPIResponse, WeatherAPIResponse.class);
        return response;
    }
}
