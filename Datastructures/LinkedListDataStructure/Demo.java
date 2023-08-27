package Datastructures.LinkedListDataStructure;

public class Demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addLast(0);
        ll.addAt(15, 2);
        ll.display();
        System.out.println();
        // System.out.println(ll.removeLast());
        System.out.println(ll.reverseLL());
        ll.traverseIterative();
    }
}
