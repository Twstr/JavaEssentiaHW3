package Vehicle;

public class Ship extends Vehicle {

    private String port;
    private int passengersAmount;

    public Ship(double price, double speed, double year, String port, int passengersAmount) {
        super(price, speed, year);
        this.port = port;
        this.passengersAmount = passengersAmount;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }
}
