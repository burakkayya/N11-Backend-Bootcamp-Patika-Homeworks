package com.burakkaya.odev3.api.controller;

import com.burakkaya.odev3.business.abstracts.WeatherService;
import com.burakkaya.odev3.business.dto.WeatherAPIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/daily/{city}")
    public ResponseEntity<WeatherAPIResponse> getDaily(@PathVariable String city) {
        WeatherAPIResponse response = weatherService.getWeatherDataDaily(city);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/weekly/{city}")
    public ResponseEntity<WeatherAPIResponse> getWeekly(@PathVariable String city) {
        WeatherAPIResponse response = weatherService.getWeatherDataWeekly(city);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/monthly/{city}")
    public ResponseEntity<WeatherAPIResponse> getMonthly(@PathVariable String city) {
        WeatherAPIResponse response = weatherService.getWeatherDataMonthly(city);
        return ResponseEntity.ok(response);
    }
}
