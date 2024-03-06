package com.burakkaya.odev3.business.concretes;

import com.burakkaya.odev3.business.abstracts.WeatherAPIService;
import com.burakkaya.odev3.business.dto.WeatherAPIResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class WeatherAPIManager implements WeatherAPIService {
    @Value("${weatherAPI.apiUrl}")
    private String apiUrl;

    @Value("${weatherAPI.apiKey}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherAPIManager(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherAPIResponse makeADailyRequest(String city) {

        String now = LocalDate.now().toString();

        String endpoint = apiUrl + city + "/" + now + "?include=days&unitGroup=metric&key=" + apiKey;
        WeatherAPIResponse weatherAPIResponse = restTemplate.getForObject(endpoint, WeatherAPIResponse.class);
        return weatherAPIResponse;
    }

    @Override
    public WeatherAPIResponse makeAWeeklyRequest(String city) {
        String endpoint = apiUrl + city + "/next7days?include=days&unitGroup=metric&key=" + apiKey;
        WeatherAPIResponse weatherAPIResponse = restTemplate.getForObject(endpoint, WeatherAPIResponse.class);
        return weatherAPIResponse;
    }

    @Override
    public WeatherAPIResponse makeAMonthlyRequest(String city) {
        String endpoint = apiUrl + city + "/next30days?include=days&unitGroup=metric&key=" + apiKey;
        WeatherAPIResponse weatherAPIResponse = restTemplate.getForObject(endpoint, WeatherAPIResponse.class);
        return weatherAPIResponse;
    }
}
