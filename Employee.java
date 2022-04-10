package University;

import java.util.Scanner;

public class Employee extends People {
    private int salary;
    public Employee(){

    }
    public Employee(String name,int age, String code,int salary){
        super(name, age, code);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void input(){
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Salary:");
        setSalary(sc.nextInt());
    }
    public void output(){
        super.output();
        System.out.println("Salary: "+getSalary());
    }
}
