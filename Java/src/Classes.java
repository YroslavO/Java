public class Classes {
    public static void main( String[] args ) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 50;
        person1.speak();
        person1.seyHello();

        Person person2 = new Person();
        person2.name = "Max";
        person2.age = 28;
        person2.speak();
        int year1 = person2.calculate();
        System.out.println("out "+year1);
    }
}

class Person{
    String name;
    int age;
    int calculate(){
        int years = 65-age;
        return years;

    }
    void speak(){
        for(int i = 0;i<3;i++){
            System.out.println("my name "+name+",my"+age);
        }

        }
    void seyHello(){
        System.out.println("Hello");
    }

}