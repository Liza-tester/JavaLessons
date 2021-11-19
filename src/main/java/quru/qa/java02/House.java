package quru.qa.java02;

public class House {
    static int totalNumberInArea = 0;
    static String area = "Pushkin street";
    int number = 0;
    String type;
    Flats flats;

    public House() {
        totalNumberInArea += 1;
        this.number = totalNumberInArea;
        this.type = "Apartment";
        this.flats = new Flats();
    }

    public House(String type) {
        totalNumberInArea += 1;
        this.number = totalNumberInArea;
        this.type = type;
        this.flats = new Flats();
    }

    public static int getTotalNumberInArea() {
        return totalNumberInArea;
    }

    public static String getArea() {
        return area;
    }

    public static void setArea(String area) {
        House.area = area;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    static class Flats {
        static double minPrice = 1234567;
        byte number;

        public Flats() {
            this.number = (byte) (Math.random() * 100 + 1);
        }

        public static double getMinPrice() {
            return minPrice;
        }

        public static void setMinPrice(double minPrice) {
            Flats.minPrice = minPrice;
        }

        public byte getNumber() {
            return number;
        }
    }
}
