package org.example.entities;

import org.example.entities.enums.RealEstateType;

public abstract class RealEstate {
    private RealEstateType type;
    private int area;
    private int roomCount;
    private int salonCount;
    private int price;

    public RealEstate() {
    }

    public RealEstate(RealEstateType type, int area, int roomCount, int salonCount, int price) {
        this.type = type;
        this.area = area;
        this.roomCount = roomCount;
        this.salonCount = salonCount;
        this.price = price;
    }

    public RealEstateType getType() {
        return type;
    }

    public void setType(RealEstateType type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getSalonCount() {
        return salonCount;
    }

    public void setSalonCount(int salonCount) {
        this.salonCount = salonCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "Type: " + type + ", Area: " + area + ", Room Count: " + roomCount + ", Salon Count: " + salonCount + ", Price: " + price;
    }
}
