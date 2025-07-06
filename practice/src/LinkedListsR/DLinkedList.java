package LinkedListsR;

public class DLinkedList {
    private Node head;
    private int size;

    public DLinkedList(){
        this.size = 0;
    }









    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(){
            this.val = val;
        }
    }
}
