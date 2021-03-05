public class ElectroCar implements Vehicle {
    private double batteryCapacity = 250;

    public ElectroCar(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void drive(double km) {
        batteryCapacity -= km*10;
        System.out.println(" Сalories left for the day :" + km*10);
    }

    @Override
    public void park() {
        System.out.println(" Сalories left for the day :" + batteryCapacity);
    }

    @Override
    public String toString() {
        return " Сalories left for the day :" + batteryCapacity;
    }
}
