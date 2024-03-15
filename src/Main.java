
public class Main {
    public static void main(String[] args) {


        //Insertion and Deletion methods are inside the Insertion class
      Insertion list = new Insertion();
        //array to linked list

        int[] array = {1, 2, 3, 4};
        list.head = new Node(array[0]);
        for(int i = 1; i < array.length; i++){
            list.append(array[i]);
        }

        //inserts 5 after 3
        list.insertAfter(3, 5);

        //inserts 7 at the end
        list.insertEnd(7);

        //deletes 7
        list.deleteLast(7);

        //deletes 5
        list.deleteAny(5);

        //deletes the last node
        list.deleteN();

        //Prints the list, should be 1, 2, 3
        list.head.printList();



        System.out.println(" ");
        //Splitting the list

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Split list2 = new Split();
        list2.head = new Node(arr[0]);
        for(int i = 1; i < arr.length; i++){

            list2.append(arr[i]);

        }
        //Splits the list into two lists
        list2.FrontBackSplit();









    }
}