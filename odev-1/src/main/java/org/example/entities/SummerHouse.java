package org.example.entities;

import org.example.entities.enums.RealEstateType;

public class SummerHouse extends RealEstate{
    public SummerHouse(int area, int salonCount, int roomCount, int price) {
        super(RealEstateType.SUMMER_HOUSE, area, salonCount, roomCount, price);
    }
}
