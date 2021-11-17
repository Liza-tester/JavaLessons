package quru.qa;

public class tryMyClasses {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Fererro", "Raffaello", 1426.70, 30);
        System.out.println(candy1.getInformation());
        System.out.println(candy1.buyProduct(60));
        candy1.addProduct(60);
        candy1.changePrice(1499.99);
        candy1.addTaste("raspberry");
        candy1.addExpirationDate("20.03.2022");
        System.out.println(candy1.getInformation());
        System.out.println(candy1.buyProduct(0.45));
        System.out.println(candy1.getInformation());

        Car car1 = new Car("BMW", "X5", 7250000, 5);
        System.out.println("\n\n" + car1.getInformation());
        car1.addProduct(3);
        car1.changePrice(7200000);
        car1.addBodyType("SUV");
        car1.addColor("white");
        car1.addYear("2020");
        System.out.println(car1.buyProduct(1));
        System.out.println(car1.getInformation());


    }
}
