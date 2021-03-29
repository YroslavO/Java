public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("off");

        for (int x=0; x <= 15; x++) {
            if (x % 2 == 1) {
                continue;
            }
            System.out.println(x);


        }
    }


}