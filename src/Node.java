public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void printList(){
        Node current = this;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }



    public void append(int data){
        Node newNode = new Node(data);
        Node current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAfter(int prev_node, int data){
        Node newNode = new Node(data);
        Node current = this;
        while(current.data != prev_node){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);
        Node current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

}


