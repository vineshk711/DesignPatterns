package models.spot;

public class HeavyVehicleSpot extends ParkingSpot {
    private Integer price = 30;

    public Integer getPrice() {return this.price;}
    public void setPrice(Integer price) {
        this.price = price;
    }
}
