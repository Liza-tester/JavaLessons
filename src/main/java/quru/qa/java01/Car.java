package quru.qa.java01;

public class Car extends Product {

    String brand;
    String model;
    String color;
    String year;
    String bodyType;

    public Car(String brand, String model, double price, double amount) {
        super(price, "pc", amount);
        this.brand = brand;
        this.model = model;
        this.bodyType = "no information";
        this.year = "no information";
        this.color = "no information";
    }

    public void addColor(String color) {
        this.color = color;
    }

    public void addYear(String year) {
        this.year = year;
    }

    public void addBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String getInformation() {
        if (amount > 0)
            return this.brand + " " + this.model + "\n"
                    + super.getInformation() + "\n"
                    + "body type = " + this.bodyType + "\n"
                    + "year = " + this.year + "\n"
                    + "color = " + this.color + "\n";
        else return super.getInformation();
    }

}
