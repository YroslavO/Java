package Test;

public class Animal {
    private int id;
    public Animal(){

    }
    public Animal(int id){
        this.id = id;
    }



    public String toSting(){
        return String.valueOf(id);

    }
}
