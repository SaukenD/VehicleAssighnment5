import java.lang.reflect.InvocationTargetException;

public class main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Vehicle vehicle = new Vehicle() {

            @Override
            public void drive(double km) {
                    System.out.println("fuel will decrease by :" + km*10);
            }
        };
        vehicle.drive(100);

        final ElectroCar electroCar = ElectroCar.class.getConstructor(double.class).newInstance(200);
        System.out.println(electroCar);

        final Car car = Car.class.getConstructor(double.class).newInstance(1000);
        System.out.println(car);
    }
}
