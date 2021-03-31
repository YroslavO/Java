import java.util.Scanner;

public class Switch {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input age");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("birth");
                break;
            case 7:
                System.out.println("school");
                break;
            case 18:
                System.out.println("university");
                break;
            default:
                System.out.println("non");
        }
    }
}
