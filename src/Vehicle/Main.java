package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(14.5, 220, 1991);
        Plane plane = new Plane(178, 14000, 2015, 100, 11111);
        Ship ship = new Ship(120,60,2020,"Kyiv",700);
        System.out.println(car.getPrice() + " " + car.getSpeed() + " " + car.getYear());
        System.out.println(plane.getPrice() + " " + plane.getSpeed() + " " + plane.getYear()
                            + " " + plane.getHeight() + " " + plane.getPassengersAmount());
        System.out.println(ship.getPrice() + " " + ship.getSpeed() + " " + ship.getYear()
                + " " + ship.getPort() + " " + ship.getPassengersAmount());
    }
}
