package LinkedList;

public class LLSingly {
    private  int size;
    private Node head;
    private Node tail;

    public LLSingly() {
        this.size = 0;
    }
/// INSERTION
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
            tail = head;
        size+=1;
    }

    public void insertAtEnd(int val){
        if(this.head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insertAtIndex(int val, int index) throws  NullPointerException{

        if(index > size) {
            System.out.println("Bhadwe max length is  " + size);
            return;
        }
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size){
            insertAtEnd(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;


        size++;


    }

    public void insertAtindexRec(int val, int index){
        if(index > size) {
            System.out.println("Index mustn't be greater than size");
            return;
        }
//        helperRet(val, head, index);
        helperNoRet(val, head, index);

    }

    private Node helperRet(int val, Node temp, int index){

        if(index == 0){
            Node node = new Node(val, temp);
            size++;
            return node;
        }
        temp.next = helperRet(val, temp.next, --index);

        return temp;

    }

    private void helperNoRet(int val, Node temp, int index){
        if(index == 1){
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
            return;
        }
        helperNoRet(val, temp.next, --index);
    }
/// DELETION
    public int deleteAtFirst(){
        /// MY METHOD
//        int val = head.value;
//        if(head == tail){
//            head = head.next;
//            tail = tail.next;
//            size--;
//            return val;
//        }
//        head = head.next;
//        size--;
//        return val;

        /// KUNAL METHOD
        if(size == 0) {
            System.out.println("No elements present to delete man");
            return -1;
        }
        int val = head.value;
        head = head.next;
        if(head == null)//if node has no other elements connected to it the head becomes null
            tail = tail.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1)
            return deleteAtFirst();
        Node secondLast = get(size - 2); //LL doesnt start from index 0, so we find the element that is just behind the last element
        //and size is always a number extra
        int val = tail.value;
        /// works
//        secondLast.next = null;
//        tail = secondLast;
        /// kunal
            tail = secondLast;
            tail.next = null;



        return val;
        }
    public int deleteAtIndex (int index){
       if(index == 0)
            return deleteAtFirst();
       if(index == size -1)
            return deleteLast();

       //first find the prev_elem of the elem you want to remove
        // with the prev_elem's next value we can navigate original index value
       Node previousElement = get(index - 1);
       int val = previousElement.next.value; //goes to the next node and gets the value of it

        previousElement.next = previousElement.next.next;
        return val;
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

    public Node get(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp; //returns the point right before the element we need to modify
    }





    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End" + size);
    }



    /// leetCode

    public LLSingly mergerr(LLSingly list1, LLSingly list2){
        Node head1 = list1.head;
        Node head2 = list2.head;
        LLSingly res = new LLSingly();
        while(head1 != null && head2 != null){
            if(head1.value < head2.value){
                res.insertAtEnd(head1.value);
                head1 = head1.next;
            }
            else {
                res.insertAtEnd(head2.value);
                head2 = head2.next;
            }
        }

        while(head1 != null){
            res.insertAtEnd(head1.value);
            head1 = head1.next;

        }

        while (head2 != null){
            res.insertAtEnd(head2.value);
            head2 = head2.next;
        }
        return res;

    }





    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
