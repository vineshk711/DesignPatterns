package models;

public abstract class ElectronicDevice {
    protected String name;
    protected Integer price;

    public abstract void setPrice(Integer price);
    public abstract void setName(String name);

    public abstract void createDevice(Integer price, String name);

}
