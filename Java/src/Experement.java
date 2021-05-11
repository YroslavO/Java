import java.util.Scanner;
public class Experement {
public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    int n = x.nextInt();
    int i = 0;
    while(i<=n){
        if(i%2==0){
            System.out.println(i);
            i++;
            continue;
        }
        i++;
    }
}
}
