import java.util.Scanner;

public class Switch2 {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        String age = scanner.nextLine();

         switch (age){
             case "one" :
                 System.out.println("one");
                 break;
             case "two" :
                 System.out.println("two");
                 break;
             default:
                 System.out.println("default");
         }

       /*
       int age = scanner.nextInt();
       switch (age){
           case 1 :
               System.out.println("you born");
               break;
           case 7 :
               System.out.println("you go to school");
               break;
           case 18 :
               System.out.println("you go to universite");
               break;
           default:
               System.out.println("you miss");


       }
      */
    }
}
