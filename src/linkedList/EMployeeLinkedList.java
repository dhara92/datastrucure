package linkedList;

public class EmployeeLinkedList {

    private  EmployeeNode head;

    public int getSize() {
        return size;
    }

    private  int size;

    public  void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }
    public void printList(){
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current !=null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");

    }
    public  boolean isEmpty(){
        return  head == null;
    }
}
