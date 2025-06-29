package LinkedList;

public class LLDoubly {
    private int size;
    private Node head;
    private Node tail;

///  Insertions
    public void insertAtFirst(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        node.prev = null;

        head.prev = node;
        head = node;

        size++;
    }

    public void insertAtEnd(int val){
        Node node = new Node(val);
        Node temp = head; //traversing without tail element

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            size++;
            return;

        }
        while(temp.next != null){
            temp = temp.next;
        }
        node.prev = temp;
        node.next = null;

        temp.next = node;


    }

    public void insertAtIndex(int val, int index){
        Node node = new Node(val);
        Node prevElement = get(index);

        node.next= prevElement.next;
        node.prev = prevElement;


        if(prevElement.next != null) {
            prevElement.next.prev = node;
//          curr.prev = node;
        }
        prevElement.next = node;

    }

    public void insertAfterValue(int after, int val){
        Node node = new Node(val);
        Node prevElement = find(after);

        if(prevElement == null){
            System.out.println("Element doesnt exist");
            return;
        }

        node.next= prevElement.next;
        node.prev = prevElement;


        if(prevElement.next != null) {
            prevElement.next.prev = node;
//          curr.prev = node;
        }
        prevElement.next = node;

    }

    public Node find(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    /// displaying
    public void display(){
        Node temp =  head;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node temp =  tail;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    public void displayWO_tail(){
        Node temp =  head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.value + "-> ");
            last = temp; //for finding end element
            temp = temp.next;
        }
        System.out.println("END");

        while(last != null){
            System.out.print(last.value + "-> ");
            last = last.prev;
        }
        System.out.println("START");
    }

///deletions

    public Node get(int index){
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node next){
            this.value = val;
            this.next = next;
        }

        public Node(int val, Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
