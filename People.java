package University;
import java.util.Scanner;

public class People {
    private String name;
    private int age;
    private String code;
    public static void main(String args[]){
        People people1 =new People();
        people1.input();
        System.out.println(people1.toString());

    }
    public People(String name,int age, String code){
        this.name=name;
        this.age=age;
        this.code=code;
    }
    public People(){
        this.name="NULL";
        this.age=0;
        this.code="0";
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name:");
        setName(sc.nextLine());
        System.out.println("Enter age:");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter code:");
        setCode(sc.nextLine());
    }
    public void output(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Code: "+getCode());
    }

}
