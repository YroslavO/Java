public class Classes {
    public static void main( String[] args ) {
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 50;

        System.out.println("My name "+person1.name+","+"my age "+person1.age);

        Person person2 = new Person();
        person2.name = "Max";
        person2.age = 28;

        System.out.println("My name "+person2.name+","+"my age "+person2.age);
    }
}

class Person{
    String name;
    int age;
}