package models.concretModels;

import models.ElectronicDevice;

public class WashingMachine extends ElectronicDevice {

    @Override
    public void setName(String name) {
        this.name = name + " Washing Machine";
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price + (int) (0.15 * price);
    }

    @Override
    public void createDevice(Integer price, String name) {
        setName(name);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
