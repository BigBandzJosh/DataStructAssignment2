public class Split {

    Node head;

    public void append(int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }



    public void FrontBackSplit(){
        Node current = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            current = current.next;
            fast = fast.next.next;
        }
        Node first = head;
        Node second = current.next;
        current.next = null;
        first.printList();
        System.out.println(" ");
        second.printList();
    }


}
