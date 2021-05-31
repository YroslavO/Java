package All;

public class AandS {
    public static void main (String[] args){
        String[] x = new String[10];
        String y = "i";
        String sum = new String();
        for (int i =0;i<x.length ;i++){

            x[i] = "i";
            sum = x[i]+sum;
            System.out.println(sum);
        }
        for(String i:x){
            System.out.println(sum);
        }
    }
}
