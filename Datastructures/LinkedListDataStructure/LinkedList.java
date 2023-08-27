package Datastructures.LinkedListDataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        head = tail = null; // We are Storing Head
        size = 0;
    }

    public void traverseIterative() {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            System.out.print("->");
        }
    }

    public void traverseRecursive(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        traverseRecursive(head.next);
    }

    public void addFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
        if (size == 0)
            tail = n;
        size++;
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = tail = n;
        }
        tail.next = n;
        tail = tail.next;
        size++;
    }

    public void addAt(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
        } else if (idx == size) {
            addLast(data);
        } else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public int getAt(int idx) {
        if (idx == 0) {
            return head.data;
        } else if (idx == size) {
            return tail.data;
        } else {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public int removeFirst() {
        int op = head.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
        return op;
    }

    public int removeLast() {
        int op = tail.data;
        if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            while (temp.next!= tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
        return op;
    }
    public int removeAt(int idx){
        int op = -1;
        if(idx==0) op = removeFirst();
        else if(idx==size-1) op= removeLast();
        else{
            Node temp = head;
            for (int i = 1; i <= idx; i++) 
            {
                temp = temp.next;
            }
            op = temp.next.data;
            temp.next = temp.next.next;
            size--;
        }
        return op;
    }

    public int getSize() {
        return size;
    }

    public Node reverseLL(){
        Node prev = null;
        Node temp = null;
        Node curr = head;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }
    public void display() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
}
