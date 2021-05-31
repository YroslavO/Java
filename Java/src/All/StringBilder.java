package All;

public class StringBilder {
    public static void main( String[] args ) {
        StringBuilder sb =new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
        int y = 15000;
        String x;
        System.out.printf("%d",y);
    }
}
