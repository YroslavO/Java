package All;

import java.util.Scanner;

public class Arrays2 {
    public static void main (String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }
        int[] x = {1, 23, 2343, 353, 24234, 242};
        for (int n = 0 ;n < x.length ;n++){
            System.out.println(x[n]);
        }


    }

}
