import java.util.Scanner;
public class MultiArrays {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("input haigh");
        int put = number.nextInt();
        System.out.println("input length");
        int put2 = number.nextInt();
        int [][] array= new int [put][put2];
        for(int i =0;i<put;i++){
            for(int x = 0;x<put2;x++){
                System.out.print(array[i][x]+"  ");
            }
            System.out.println();
        }
    }
}
