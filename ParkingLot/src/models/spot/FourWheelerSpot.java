package models.spot;

public class FourWheelerSpot extends ParkingSpot {
    private Integer price = 20;

    public Integer getPrice() { return price;}
    public void setPrice(Integer price) {
        this.price = price;
    }
}
