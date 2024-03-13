
public class Main {
    public static void main(String[] args) {

        Node head = new Node(7);

        head.append(5);

        head.insertAfter(7, 1);

        head.insertEnd(8);

        head.printList(); // 5 2 1 3

    }
}