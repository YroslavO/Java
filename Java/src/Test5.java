import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main( String[] args ) {
        List<Animal> animalss = new ArrayList<>();
        animalss.add(new Animal(1));
        animalss.add(new Animal(2));

        test(animalss);

    }
    public   static void test(List<Animal> list){
        for(Animal animal : list){
            System.out.println(animal);
        }
    }
}
