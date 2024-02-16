package org.example;

import org.example.business.RealEstateService;
import org.example.entities.House;
import org.example.entities.SummerHouse;
import org.example.entities.Villa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RealEstateService realEstateService = new RealEstateService();
        realEstateService.addRealEstate(new House("House", 150, 3, 1, 200000));
        realEstateService.addRealEstate(new House("House", 200, 4, 1, 250000));
        realEstateService.addRealEstate(new House("House", 120, 2, 1, 180000));
        realEstateService.addRealEstate(new House("House", 180, 3, 1, 220000));
        realEstateService.addRealEstate(new House("House", 220, 4, 2, 270000));

        realEstateService.addRealEstate(new Villa("Villa", 300, 5, 2, 500000));
        realEstateService.addRealEstate(new Villa("Villa", 350, 6, 3, 600000));
        realEstateService.addRealEstate(new Villa("Villa", 400, 7, 3, 700000));
        realEstateService.addRealEstate(new Villa("Villa", 450, 8, 4, 800000));
        realEstateService.addRealEstate(new Villa("Villa", 500, 9, 4, 900000));

        realEstateService.addRealEstate(new SummerHouse("SummerHouse", 100, 2, 1, 150000));
        realEstateService.addRealEstate(new SummerHouse("SummerHouse", 120, 3, 1, 180000));
        realEstateService.addRealEstate(new SummerHouse("SummerHouse", 80, 2, 1, 130000));
        realEstateService.addRealEstate(new SummerHouse("SummerHouse", 90, 3, 1, 160000));
        realEstateService.addRealEstate(new SummerHouse("SummerHouse", 110, 2, 1, 170000));

        System.out.println("House List: " + realEstateService.getHouseList());
        System.out.println("\n");
        System.out.println("Villa List: " + realEstateService.getVillaList());
        System.out.println("\n");
        System.out.println("SummerHouse List: " + realEstateService.getSummerHouseList());

        System.out.println("\n");
        System.out.println("Total price of Houses: " + realEstateService.getTotalPrice("House"));
        System.out.println("Total price of Villas: " + realEstateService.getTotalPrice("Villa"));
        System.out.println("Total price of SummerHouses: " + realEstateService.getTotalPrice("SummerHouse"));
        System.out.println("Total price of all: " + realEstateService.getTotalPrice());

        System.out.println("\n");
        System.out.println("Average area of Houses: " + realEstateService.getAverageArea("House"));
        System.out.println("Average area of Villas: " + realEstateService.getAverageArea("Villa"));
        System.out.println("Average area of SummerHouses: " + realEstateService.getAverageArea("SummerHouse"));
        System.out.println("Average area of all: " + realEstateService.getAverageArea());

        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rooms: ");
        int roomCount = scanner.nextInt();
        System.out.print("Enter the number of salons: ");
        int salonCount = scanner.nextInt();

        System.out.println("Real estates with " + roomCount + " rooms and " + salonCount + " salons: " + realEstateService.filterByRoomAndSalonCount(roomCount, salonCount));

    }
}