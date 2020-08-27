package Vehicle;

public class Vehicle {
    private double price;
    private double speed;
    private double year;

    public Vehicle(double price, double speed, double year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }
}
