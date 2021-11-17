package quru.qa;

public class Candy extends Product {
    String brand;
    String name;
    String taste;
    String expirationDate;

    public Candy(String brand, String name, double price, double amount) {
        super(price, "kg", amount);
        this.brand = brand;
        this.name = name;
        this.taste = "no information";
        this.expirationDate = "no information";
    }

    public void addTaste(String taste) {
        this.taste = taste;
    }

    public void addExpirationDate(String date) {
        this.expirationDate = date;
    }

    @Override
    public String getInformation() {
        if (amount > 0)
            return this.brand + " " + this.name + "\n"
                    + super.getInformation() + "\n"
                    + "taste = " + this.taste + "\n"
                    + "expiration date = " + this.expirationDate + "\n";
        else return super.getInformation();
    }
}
