package All;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeption {
    public Exeption( String description ) {
    }

    public static void main( String[] args ) throws FileNotFoundException {
        File file = new File("qweqeq");
        try{
        Scanner scanner = new Scanner(file);
            System.out.println("in try");
    }catch (FileNotFoundException i ){
            System.out.println("File not access");
        }
        System.out.println("After try-catch");
}}
