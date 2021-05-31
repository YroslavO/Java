package Interface2;

public class Bus implements Info2 {
    public String route;
    public Bus(String route){
        this.route = route;
    }
    public void openTheDoor(){
        System.out.println("I am opening doors");
    }
    public void showCar(){
        System.out.println("I am going to "+this.route);
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }
}
