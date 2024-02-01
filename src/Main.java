public class Main {
}
interface LandVehicle {
    void drive();
}
interface SeaVehicle {
    void sail();
}
interface AirVehicle {
    void fly();
}
class Car implements  LandVehicle{
    public void drive(){
        System.out.println("A car drives on land");
    }
    public void sail(){
        System.out.println("The vehicle can be driven on land as well");
    }
}
class Airplane implements  AirVehicle{
    public void fly() {
        System.out.println("This vehicle moves in air");
    }
}
class MyMain{
    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println("How does ana airplane move");
        car1.drive();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
    }
}