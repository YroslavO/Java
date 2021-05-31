package All;

import java.util.Scanner;
public class Arrays_multi {
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);
        System.out.println("put length 1");
        int put_in = put.nextInt();
        System.out.println("put length 2");
        int put_in2 = put.nextInt();
        int [][] mass = new int[put_in][put_in2];


        for(int i =0;i<put_in;i++){
            for(int x = 0;x<put_in2;x++){
                mass[i][x]= 0;
                System.out.print(mass[i][x]+"  ");

            }
            System.out.println();
        }

    }
}
