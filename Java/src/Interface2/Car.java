package Interface2;

public class Car implements Info2 {
    public int number;
    public Car(int number){
        this.number = number;
    }
    public void drive(){
        System.out.println("I am going");
    }
    public void showCar(){
        System.out.println("My number is "+this.number);
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine ");

    }
}


