package com.burakkaya.odev3.business.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherAPIResponse {
    private String address;

    private List<WeatherDataResponse> days;
}
