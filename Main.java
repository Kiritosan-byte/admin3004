package University;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();

        //Nhập số lượng người để thêm vào ArrayList
        System.out.println("Enter number of people");
        int number=scanner.nextInt();
        for (int i = 0; i <number; i++) {
            System.out.println("Enter 1 to input student, else will input employee");
            int type=scanner.nextInt();
            if(type==1){
            Student student1 = new Student();
            student1.input();
            managerOfficer.addPeopple(student1);
            }
            else{
                Employee employee = new Employee();
                employee.input();
                managerOfficer.addPeopple(employee);
            }
        }
        //show dữ liệu toàn bộ arraylist
        managerOfficer.show();

        //nhập tên để tìm kiếm people trùng với keyword đã nhập
        System.out.println("Enter name to search");
        scanner.nextLine();
        String name= scanner.nextLine();
        managerOfficer.searchPeopleByName(name).forEach(people -> {
            people.output();
        });
    }
}
