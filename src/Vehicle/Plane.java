package Vehicle;

public class Plane extends Vehicle {
    private double height;
    private int passengersAmount;

    public Plane(double price, double speed, double year, int passengersAmount, double height) {
        super(price, speed, year);
        this.passengersAmount = passengersAmount;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }
}
