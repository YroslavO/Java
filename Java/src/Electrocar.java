

public class Electrocar {
    private int id;

    private class Motor{
        public void startMotor(){
            System.out.println("Motor is starting...");
        }

    }

    public static class Battery{
        public void charge(){
            System.out.println("Battery is charge...");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final int x=1;

        class SomeClass{
            public void someMethod(){
                System.out.println("someMethod");
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electricar " + id + " is starting...");
    }

    public void test(Object object){
        System.out.println("start");
    }

}
