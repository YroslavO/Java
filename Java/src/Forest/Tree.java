package Forest;

import java.awt.*;

public class Tree {
    public static void main( String[] args ) {
        Squirell s1 = new Squirell();
        s1.eating();
        Flover rose = new Flover();
        rose.smail("Red");
        int v1 = 6;
        int v2 = 36;
        System.out.println(++v2/v1);


    }
}
class Flover{
    int lepestok;
    String color;

    public  void smail(String color){
        this.color = color;
        System.out.println("Color is "+this.color);
    }


}
