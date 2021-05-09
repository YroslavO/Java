import java.util.Scanner;  //

public class DuWhile2 {         //
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        System.out.println("input 5");
        int value = scanner.nextInt(); //
        while(value!=5){
            System.out.println("input 5");
            value =  scanner.nextInt();
        }
        System.out.println("you input 5");
    }
}
