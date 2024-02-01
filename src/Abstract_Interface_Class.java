abstract class Vehicle{

}
class  Bus extends Vehicle implements SelfDriving{
    void  startEngine(){
        System.out.println("The bus engine has started");
    }
}