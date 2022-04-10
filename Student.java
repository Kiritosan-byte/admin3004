package University;

import java.util.Scanner;

public class Student extends People{
    private float point;
    public Student(String name,int age, String code,float point){
        super(name, age, code);
        this.point=point;
    }
    public Student(){

    }
    public void setPoint(float point) {
       this.point=point;
    }
    public float getPoint() {
        return point;
    }

    public void input(){
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter point:");
        setPoint(sc.nextFloat());
    }
    public void output(){
        super.output();
        System.out.println("Point: "+getPoint());
    }
}
