package quru.qa.java01;

import static java.lang.Math.round;

public class Product {
    //цена за единицу
    double price;
    //количество товара на складе в кг, штуках.
    double amount;
    //единица измерения количества товара
    String unit;

    public Product(double price, String unit, double amount) {
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public void addProduct(double amount) {
        if (amount > 0) this.amount += amount;
    }

    public void changePrice(double price) {
        this.price = price;
    }

    public String getInformation() {
        if (this.amount > 0)
            return "price = " + this.price + "\n"
                    + "amount = " + this.amount + " " + this.unit;

        else return "no such product";
    }

    public String buyProduct(double amount) {
        if (this.amount < amount || this.amount == 0) return "not enough product";
        else {
            this.amount -= amount;
            return "Purchase is completed. Price = " + round(this.price * amount * 100) / 100.0;
        }
    }


}
