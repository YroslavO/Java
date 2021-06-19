package All;

import java.util.Scanner;

public class ValidationCard {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas input your number of card");
        long number = scanner.nextLong();
        long j = 1000000000000000L;
        long i = 9999999999999999L ;
        if(number<i && number>j){
            System.out.println("You input valid number of card");
        }else{
            System.out.println("Error");
        }
    }
}
