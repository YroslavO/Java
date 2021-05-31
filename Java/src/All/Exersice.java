package All;

import java.util.Scanner;
public class Exersice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] mass = new int[length];
        int sum  =0;

        for(int i = 0;i<length;i++){
            int elment = scanner.nextInt();
            mass[i] = elment;
            if(elment%4!=0){
                sum = sum +elment;
            }


        }
        System.out.println(sum);
        }

    }

