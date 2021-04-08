public class Classes {
    public static void main( String[] args ) {
        Person person1 = new Person();

        person1.setName("");
        person1.setAge(-1);
        System.out.println("out information name "+person1.getName());
        System.out.println("out information age "+person1.getAge());
        person1.getAge();




    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("need name");}
        else{
            name = userName;
        }

    }

    public String getName(){
        return  name;
    }

    public void setAge(int userAge){
        if(userAge<=0){
            System.out.println("need age");
        }else{
            age = userAge;
        }

    }

    public int getAge(){
        return age;
    }



    int calculate(){
        int years = 65-age;
        return years;

    }
    void setNameAndAge(String username, int userage){
        name = username;
        age =  userage;
    }




    void speak(){
        for(int i = 0;i<3;i++){
            System.out.println("my name "+name+",my age "+age+" years");
        }

        }



    void seyHello(){
        System.out.println("Hello");
    }




}