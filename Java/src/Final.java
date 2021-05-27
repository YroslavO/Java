import java.util.Scanner;
public class Final {
    public static void main( String[] args ) {
        Scanner put = new Scanner(System.in);
        System.out.println("Put your name");
        String x = put.nextLine();
        System.out.println("Put your age");
        int y = put.nextInt();
        System.out.println();
        if(x.length()==0){
            Test2 you = new Test2();
        }else {
            Test2 you = new Test2(x,y);
        }

    }
}
class Test2{
   private String name;
   private int age;


    public Test2(){
        System.out.println("You do not enter name of age");
    }


   public Test2(String name,int age){
       this.name = name;
       this.age = age;
       System.out.println("Hello "+name+" ! And your age "+age+" !" );
   }

   public void setName(String name){
       this.name = name;
   }
   public void setAge(int age){
       this.age = age;
   }

   }
