package Interface2;

public class Truck {
    public static void main( String[] args ) {
        Car bmv = new Car(1);
        Bus bus = new Bus("Sity center");
        bmv.drive();
        bus.openTheDoor();
        bmv.showCar();
        bus.showCar();
        bmv.startEngine();
        bus.startEngine();
        Info2 audi = new Car(2);
        Info2 train = new Bus("Another sity");
        audi.showCar();
        outputInfo2(bmv);


        }

    public static void outputInfo2(Info2 cars){
            cars.showCar();
        }
}