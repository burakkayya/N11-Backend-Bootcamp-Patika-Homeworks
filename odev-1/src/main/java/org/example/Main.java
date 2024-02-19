package org.example;

import org.example.business.concretes.RealEstateManager;
import org.example.entities.House;
import org.example.entities.SummerHouse;
import org.example.entities.Villa;
import org.example.entities.enums.RealEstateType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RealEstateManager realEstateManager = new RealEstateManager();
        realEstateManager.addRealEstate(new House(150, 3, 1, 200000));
        realEstateManager.addRealEstate(new House(200, 4, 1, 250000));
        realEstateManager.addRealEstate(new House(120, 2, 1, 180000));
        realEstateManager.addRealEstate(new House(180, 3, 1, 220000));
        realEstateManager.addRealEstate(new House(220, 4, 2, 270000));

        realEstateManager.addRealEstate(new Villa(300, 5, 2, 500000));
        realEstateManager.addRealEstate(new Villa(350, 6, 3, 600000));
        realEstateManager.addRealEstate(new Villa(400, 7, 3, 700000));
        realEstateManager.addRealEstate(new Villa(450, 8, 4, 800000));
        realEstateManager.addRealEstate(new Villa(500, 9, 4, 900000));

        realEstateManager.addRealEstate(new SummerHouse(100, 2, 1, 150000));
        realEstateManager.addRealEstate(new SummerHouse(120, 3, 1, 180000));
        realEstateManager.addRealEstate(new SummerHouse(80, 2, 1, 130000));
        realEstateManager.addRealEstate(new SummerHouse(90, 3, 1, 160000));
        realEstateManager.addRealEstate(new SummerHouse(110, 2, 1, 170000));

        System.out.println("House List: " + realEstateManager.getRealEstatesByType(RealEstateType.HOUSE));
        System.out.println("\n");
        System.out.println("Villa List: " + realEstateManager.getRealEstatesByType(RealEstateType.VILLA));
        System.out.println("\n");
        System.out.println("SummerHouse List: " + realEstateManager.getRealEstatesByType(RealEstateType.SUMMER_HOUSE));

        System.out.println("\n");
        System.out.println("Total price of Houses: " + realEstateManager.getTotalPrice(RealEstateType.HOUSE));
        System.out.println("Total price of Villas: " + realEstateManager.getTotalPrice(RealEstateType.VILLA));
        System.out.println("Total price of SummerHouses: " + realEstateManager.getTotalPrice(RealEstateType.SUMMER_HOUSE));
        System.out.println("Total price of all: " + realEstateManager.getTotalPrice());

        System.out.println("\n");
        System.out.println("Average area of Houses: " + realEstateManager.getAverageArea(RealEstateType.HOUSE));
        System.out.println("Average area of Villas: " + realEstateManager.getAverageArea(RealEstateType.VILLA));
        System.out.println("Average area of SummerHouses: " + realEstateManager.getAverageArea(RealEstateType.SUMMER_HOUSE));
        System.out.println("Average area of all: " + realEstateManager.getAverageArea());

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rooms: ");
        int roomCount = scanner.nextInt();
        System.out.print("Enter the number of salons: ");
        int salonCount = scanner.nextInt();

        System.out.println("Real estates with " + roomCount + " rooms and " + salonCount + " salons: " + realEstateManager.filterByRoomAndSalonCount(roomCount, salonCount));

    }
}