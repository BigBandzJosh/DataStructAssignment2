import static java.io.ObjectInputFilter.merge;

public class MergeSort {

    Node head;

    public void append(int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

}
