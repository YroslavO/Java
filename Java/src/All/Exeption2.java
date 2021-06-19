package All;

import All.Exeption;

import java.io.IOException;
import java.util.Scanner;

  class ScannerExeption extends Exeption {
    public ScannerExeption (String description){
        super(description);
    }
}



public class Exeption2 {
    public static void main( String[] args ) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x !=0){


            }
        }
    }
}
