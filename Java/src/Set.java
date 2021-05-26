import java.util.Scanner;
public class Set {
    public static void main( String[] args ) {
    Scanner put = new Scanner(System.in);

    for(int i = 0;i<3;i++){
        System.out.println("Put your name");
        String x = put.nextLine();
        System.out.println("Put your age");
        int y = put.nextInt();
        Human you= new Human(x,y);
        you.printNumberOfPeople();

    }

}
static class Human{
    private String name;
    private int age;
    private static int countPeople;

    public Human(){
        System.out.println("Hello unknow");
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Hello "+name+" ! Your age "+age+" !" );
        countPeople++;

    }
    public void setName(String neme){
        this.name = name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people "+countPeople);

    }

}
}




