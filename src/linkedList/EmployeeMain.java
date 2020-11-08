package linkedList;

public class EmployeeMain {

    public static void main(String str[]){



        Employee dhara = new Employee("Dhara","Narola",3300);
        Employee kalpesh = new Employee("Kalpesh","Pansheriya",4225);
        Employee bina = new Employee("Bina","Narola",255);

        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        list.addToFront(dhara);
        list.addToFront(kalpesh);
        list.addToFront(bina);

        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
    }
}
