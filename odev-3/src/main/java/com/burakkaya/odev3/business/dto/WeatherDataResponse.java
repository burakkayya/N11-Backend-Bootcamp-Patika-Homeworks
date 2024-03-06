package com.burakkaya.odev3.business.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDataResponse {
    private String datetime;

    private double tempmax;

    private double tempmin;

    private double temp;

    private double feelslike;

    private double humidity;

    private double windspeed;

    private String sunrise;

    private String sunset;

    private String conditions;

    private String description;
}
