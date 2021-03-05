public class Car implements Vehicle {
    private double fuel = 500;

    public Car(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public void park() {
        System.out.println("Car has been parked");;
    }

    @Override
    public void drive(double km) {
        fuel-=km*10;
    }

    @Override
    public String toString() {
        return "Fuel left :" + fuel;
    }
}
