package models.spot;

public class TwoWheelerSpot extends ParkingSpot {
    private Integer price = 10;

    public Integer getPrice() {return price;}
    public void setPrice(Integer price) {
        this.price = price;
    }
}
