package Work;

public class Emploee implements InterfaceWork {
    public int salary;

    public Emploee(int salary){
        System.out.println("My salary "+salary );
    }

    public void seySalary(int salary){
        this.salary = salary;
        System.out.println("Hello, my salary "+salary);

    }
    public void showInformation(){
        System.out.println("My salary "+this.salary);
    }
}
