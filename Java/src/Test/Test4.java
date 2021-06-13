package Test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main( String[] args ) {

        ////////////// Java>5 ///////////////
        List<String> i= new ArrayList<String>();
        i.add("cat");
        i.add("dog");
        System.out.println(i.get(1));
        String y = i.get(1);

    }
}
