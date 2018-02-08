package LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.prepend(7);
        llist.prepend(1);
        llist.prepend(3);
        llist.prepend(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.delete(0); // Delete node at position 4
        llist.deleteWithPosition(4);

        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }
}
