package Work;

public class Acountance implements InterfaceWork {
    String name;
    public Acountance(String name){
        this.name = name;
        System.out.println("My name "+name);
    }

    public void seyName(String name){
        this.name = name;
        System.out.println("Hello I am "+name);
    }
    public void showInformation(){
        System.out.println("My name "+this.name);
    }


}
