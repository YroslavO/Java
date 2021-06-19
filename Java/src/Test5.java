public class Test5 {
    public static void main( String[] args ) {
       /* Animal4 animal1 = new Animal4(1);
        Animal4 animal2 = new Animal4(1);
        System.out.println(animal1.equals(animal2)); */

        String a = "hello";
        String b = "hello123".substring(0,5);
        System.out.println(b);
        System.out.println(a);
        System.out.println(a == b);
    }
}
class Animal4 {
    private int id;
    public Animal4(int id) {
        this.id = id;
    }
    public boolean equals(Object obj){
        Animal4 otherAnimal = (Animal4) obj;
        return this.id == otherAnimal.id;

    }
}