import java.util.Scanner;

public class DuWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i ;
        i = scanner.nextInt();
        do{
            i--;
            if (i%3!=0){
                System.out.println(i);
            }else{
                continue;
            }
        }while (i > 0);
    }
}
