package org.example.business;

import org.example.entities.House;
import org.example.entities.RealEstate;
import org.example.entities.SummerHouse;
import org.example.entities.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RealEstateService {
    private List<RealEstate> realEstates;

    public RealEstateService() {
        this.realEstates = new ArrayList<>();
    }

    public void addRealEstate(RealEstate realEstate) {
        realEstates.add(realEstate);
    }

    public List<RealEstate> getHouseList() {
        return realEstates.stream()
                .filter(realEstate -> realEstate instanceof House)
                .collect(Collectors.toList());
    }

    public List<RealEstate> getVillaList() {
        return realEstates.stream()
                .filter(realEstate -> realEstate instanceof Villa)
                .collect(Collectors.toList());
    }

    public List<RealEstate> getSummerHouseList() {
        return realEstates.stream()
                .filter(realEstate -> realEstate instanceof SummerHouse)
                .collect(Collectors.toList());
    }

    public int getTotalPrice() {
        return realEstates.stream()
                .mapToInt(RealEstate::getPrice)
                .sum();
    }

    public double getAverageArea() {
        return realEstates.stream()
                .mapToInt(RealEstate::getArea)
                .average()
                .orElse(0.0);
    }

    public int getTotalPrice(String realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getType().equals(realEstateType))
                .mapToInt(RealEstate::getPrice)
                .sum();
    }

    public double getAverageArea(String realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getType().equals(realEstateType))
                .mapToInt(RealEstate::getArea)
                .average()
                .orElse(0.0);
    }

    public List<RealEstate> filterByRoomAndSalonCount(int roomCount, int salonCount) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getRoomCount() == roomCount && realEstate.getSalonCount() == salonCount)
                .collect(Collectors.toList());
    }
}
