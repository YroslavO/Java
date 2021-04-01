import java.util.Scanner;

public class DuWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i ;
        i = scanner.nextInt();
        do{


            if (i%3==0){
                continue;
            }
            System.out.println(i);
            i--;
        }while (i>=0);

    }
}
