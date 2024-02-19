package org.example.entities;

import org.example.entities.enums.RealEstateType;

public class House extends RealEstate{
    public House(int area, int salonCount, int roomCount, int price) {
        super(RealEstateType.HOUSE, area, salonCount, roomCount, price);
    }
}
