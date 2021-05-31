package All;

import java.util.Scanner;

public class ClassesAndObjects {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("put your name");
        String y = scanner.nextLine();
        System.out.println("put your age");
        int x = scanner.nextInt();
        Person you = new Person();

        you.setNamaAndAge(y,x);
        you.say();

        int penshin = you.earsTo();
        System.out.println(penshin);


    }
}
class Person{
    int age;
    String name;
    void setNamaAndAge(String username, int userage){
        name = username;
        age  =userage;

    }

    int earsTo(){
        int ears = 65-age;
        return ears;
    }
void say(){
    System.out.println("Your name "+name + " and your age "+ age);
    }
}
