public interface Vehicle {
    default void park(){
        System.out.println("Car has been parked");
    };

    void drive(double km);


}
