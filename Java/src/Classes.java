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

    }
}

class Person{
    String name;
    int age;

    void speak(){
        for(int i = 0;i<3;i++){
            System.out.println("my name "+name+",my"+age);
        }

        }
    void seyHello(){
        System.out.println("Hello");
    }

}