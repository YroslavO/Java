package Work;


public class Pyramid {
    public static void main( String[] args ) {
        String s = "";
        String k = "";
        for (int i = 0;i<=10;i++){
            s += "*";
            System.out.println(s+k);
        }

        for (int j =0;j<=10;j++){
            k+=" ";
            System.out.println(s+k);

        }


    }
}
