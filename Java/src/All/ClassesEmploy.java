package All;

import java.util.Scanner;
public class ClassesEmploy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your first name");
        String firstName = scanner.nextLine();
        System.out.println("put your second name");
        String secondName = scanner.nextLine();
        System.out.println("Put your age");
        int age = scanner.nextInt();
        System.out.println("Put your number of room");
        int room = scanner.nextInt();
        Customer you = new Customer();
        you.setFirstName(firstName);
        you.setSecondName(secondName);
        you.setAge(age);
        you.setRoom(room);

        you.seveCustomerInfo();

    }

}
class Customer{
private int age;
private int room;
private String firstName;
private String secondName;

public void setFirstName(String userName){
    firstName = userName;
}
public String getFirstName(){
    return firstName;
}
public void setSecondName(String userName2){
    secondName = userName2;
}
public String getSecondName(){
    return secondName;
}
public void setAge(int userAge){
    age = userAge;
}
public int getAge(){
    return age;
}
public void setRoom(int userRoom){
    room = userRoom;
}
public int getRoom(){
    return room;
}



public void seveCustomerInfo(){
    System.out.println("First name "+firstName);
    System.out.println("Second name "+secondName);
    System.out.println("Age "+age);
    System.out.println("Room "+room);
}
}