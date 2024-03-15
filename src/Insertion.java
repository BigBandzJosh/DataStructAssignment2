public class Insertion {

    Node head;


    public void append(int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAfter(int prev_node, int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.data != prev_node){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }



    public void deleteN(){
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAny(int data){
        Node current = head;
        while(current.next.data != data){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void deleteLast(int data){
        Node current = head;
        while(current.next.data != data){
            current = current.next;
        }
        current.next = null;
    }


}
