import java.util.Arrays;
import java.io.*;

public class ReadObject {
    public static void main( String[] args ) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personeCount = ois.readInt();
            Person[] people = new Person[personeCount];

            for (int i =0;i<personeCount;i++){
                people[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(people));

            ois.close();

        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
