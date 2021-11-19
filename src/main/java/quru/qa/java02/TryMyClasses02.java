package quru.qa.java02;

import java.util.HashSet;
import java.util.Set;

public class TryMyClasses02 {

    public static void tryHouseClass() {

        System.out.println(getAreaInfo());
        House.setArea("Lenin street");
        House.Flats.setMinPrice(2345345);

        Set<House> houses = new HashSet<>();
        houses.add(new House());
        houses.add(new House());
        houses.add(new House("Castle"));
        houses.add(new House("Condominium"));
        houses.add(new House());
        houses.add(new House("Barn"));
        houses.add(new House());

        System.out.println(getAreaInfo());
        for (House house : houses) {
            System.out.println(getHouseInfo(house));
        }

    }

    public static String getHouseInfo(House house) {
        return "\nnumber: " + house.getNumber()
                + ", type: " + house.getType()
                + ", number of flats: " + house.flats.getNumber();
    }

    public static String getAreaInfo() {
        return "\nAREA INFO" +
                "\narea: " + House.getArea() +
                "\nnumber of houses: " + House.getTotalNumberInArea() +
                "\nmin price for flat: " + House.Flats.getMinPrice();
    }

}
