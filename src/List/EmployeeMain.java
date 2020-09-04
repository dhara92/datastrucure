package List;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String str[]){

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("Dhara","Narola",3300));
        empList.add(new Employee("Kalpesh","Pansheriya",4225));
        empList.add(new Employee("Bina","Narola",255));
        empList.add(new Employee("Kiyara","Pansheriya",3654));

        empList.forEach(employee -> System.out.println(employee));

        empList.set(3,new Employee("shree","Pansheriya", 5200));

        System.out.println("After Editing");
        empList.forEach(employee -> System.out.println(employee));

        System.out.println("After adding via add method");
        empList.add(4,new Employee("kapu","pan",33));
        empList.forEach(employee -> System.out.println(employee));

    }
}
