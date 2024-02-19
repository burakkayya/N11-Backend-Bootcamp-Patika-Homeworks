package org.example.business;

import org.example.entities.House;
import org.example.entities.RealEstate;
import org.example.entities.SummerHouse;
import org.example.entities.Villa;
import org.example.entities.enums.RealEstateType;

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

    public List<RealEstate> getRealEstatesByType(RealEstateType type) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getType() == type)
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

    public int getTotalPrice(RealEstateType realEstateType) {
        return realEstates.stream()
                .filter(realEstate -> realEstate.getType().equals(realEstateType))
                .mapToInt(RealEstate::getPrice)
                .sum();
    }

    public double getAverageArea(RealEstateType realEstateType) {
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
