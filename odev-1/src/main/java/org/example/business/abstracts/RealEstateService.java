package org.example.business.abstracts;

import org.example.entities.RealEstate;
import org.example.entities.enums.RealEstateType;

import java.util.List;

public interface RealEstateService {
    void addRealEstate(RealEstate realEstate);

    List<RealEstate> getRealEstatesByType(RealEstateType type);

    int getTotalPrice();

    double getAverageArea();

    int getTotalPrice(RealEstateType realEstateType);

    double getAverageArea(RealEstateType realEstateType);

    List<RealEstate> filterByRoomAndSalonCount(int roomCount, int salonCount);
}
