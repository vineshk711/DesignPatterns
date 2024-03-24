package models.concretModels;

import models.ElectronicDevice;

public class Laptop extends ElectronicDevice {

    @Override
    public void setPrice(Integer price) {
        this.price = price + (int) (0.1 * price);
    }

    @Override
    public void setName(String name) {
        this.name = name + " Laptop";
    }

    @Override
    public void createDevice(Integer price, String name) {
        setName(name);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
