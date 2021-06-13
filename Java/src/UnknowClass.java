
interface AbleToEat {
    public void eat();
}
class Animal implements AbleToEat{
    @Override
    public void eat() {
        System.out.println("Animal is eating...");
    }


}


public class UnknowClass {
    public static void main( String[] args ) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Some one is eating...");
            }
        };
        ableToEat.eat();
    }
}
