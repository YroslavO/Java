import java.util.Scanner;
public class Experement {
public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
         int n;
    System.out.println("Please input size arrays");
         n = scanner.nextInt();
         int[] arrays = new int [n];
         arrays[9] = 10;

          for(int i=0;i<arrays.length;i++ ){

              arrays[i] = i*10;
              System.out.println(arrays[i]);
          }





         /*
         while (true){
             System.out.println("please put 1");
             int put = scanner.nextInt();

         switch (put){
             case 1 :
                 System.out.println("you put 1");
                 break;
             default:
                 System.out.println("you put not 1");
         }}*/
}
}
