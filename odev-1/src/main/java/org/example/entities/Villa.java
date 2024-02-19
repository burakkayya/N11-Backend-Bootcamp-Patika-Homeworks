package org.example.entities;

import org.example.entities.enums.RealEstateType;

public class Villa extends RealEstate{
    public Villa(int area, int salonCount, int roomCount, int price) {
        super(RealEstateType.VILLA, area, salonCount, roomCount, price);
    }
}
