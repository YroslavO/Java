import java.util.Scanner;

public class Experement {
public static void main(String[] args){
Scanner put = new Scanner(System.in);
    System.out.println("put number");
int number = put.nextInt();             // ввод целого числа
int sum = 0;                            // создание переменной-счетчик

String str = Integer.toString(number);  // конвертация целочисленной переменной в строковую
int j = str.length();    // получение длины строковой переменной для установления границ цикла

for (int i =0;i<j;i++){
    int x = number % 10; // вычисляем последний элемент числа
    sum = sum+x;         // добавляем последний элемент к переменной-счетчик
    number = number/10;  // отнимаем последний элемент чила

}
    System.out.println(sum);        // Вывод ссумы всех цифр в числе





         /*
         while (true){
             System.out.println("please put 1");
             int put = scanner.nextInt();

         switch (put){
             case 1 :
                 System.out.println("you put 1");
                 break;
             default:
                 System.out.println("you put not 1");
         }}*/
}
}
