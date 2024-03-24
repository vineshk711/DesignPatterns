package models.concretModels;

import models.ElectronicDevice;

public class Mobile extends ElectronicDevice {

    @Override
    public void setName(String name) {
        this.name = name + " Mobile";
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price + (int)(0.2 * price);
    }

    @Override
    public void createDevice(Integer price, String name) {
        setName(name);
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

