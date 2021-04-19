import java.util.Scanner;

public class FizzBizz {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int string = s.nextInt();
        int x = 1;
        while(x<=string){
            if(x%3==0 && x%5==0){
                System.out.println("fizz-bizz");
            }else if(x%5==0){
                System.out.println("bizz");
            }else if(x%3==0){
                System.out.println("fizz");
            }else{
                System.out.println(x);
            }
            x++;
        }
    }
}
