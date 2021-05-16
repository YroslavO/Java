import java.util.Scanner;
public class Experement2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input length array");
        int put = in.nextInt();
        int [] array = new int[put]; // создаю массив с длиной равной вводимой переменной
        for (int i = 0;i<put ;i++){  // создаю цикл с длиной равной вводимой переменной (-1)
            int put2 = in.nextInt(); // созда ввод второй переменной
            array[i] = put2;         // помещаю вторую теременную в ячейку
        }
        for (int i = 0;i<put ;i++){
            System.out.println(array[i]);
        }

    }
}
