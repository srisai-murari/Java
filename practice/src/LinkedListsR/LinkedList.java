package LinkedListsR;

public class LinkedList {
    /// head and tail are pointers which points to the first and last
    private Node head;
//    private Node tail;

    private int size;

    public LinkedList (){
        this.size = 0; //when a LinkedList object is created the size of that LL object is set to 0
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
//        if(tail == null) tail = head; //when there is only one element in the whole list
        size++;
    }

    public void insertEnd(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
//if few elements already exists in the list then create a node here
        Node node = new Node(val); //Node you want to add
        Node endNode = fetchTail(); //to find tail node (or) end node


        endNode.next = node;

        size++;
    }

    public void insertAt(int index, int val) {
        //if given index is out of bounds
        if (index > size) {
            System.out.println(index + " out of bounds size = " + size);
            return;
        }
        //if index is the last element's index
        if (index == size) {
            insertEnd(val);
            return;
        }
        //fetching the previous index value. So, we can modify its 'next'
        Node indexPrev = fetchIndex(index);

        Node node = new Node(val, indexPrev.next);
        indexPrev.next = node;

        size++;
    }
    /// recursion insertion
    public void recInsertAt(int index, int value){
        if(index > size){
            System.out.println("index cannot be greater than size of LL");
            return;
        }
        if(index == 0){
            Node node = new Node(value, head);
            head = node;
            return;
        }
//        HELPERrecInsertAt(index, value, head);
        HelperRecInsertAt(index, value, head);
        size++;

    }
    /// with return type
        private Node HelperRecInsertAt(int index, int value, Node temp){
            if(index == 0){
                Node node = new Node(value, temp);
                return node;
            }
            temp.next = HelperRecInsertAt(index-1, value, temp.next);
            return temp;
        }
        /// without return type
        private void HELPERrecInsertAt(int index, int value, Node temp){
            if(index == 1){
                Node node = new Node(value, temp.next);
                temp.next = node;
                return;
            }
            HELPERrecInsertAt(index-1, value, temp.next);
        }
///  deletion
    public int deleteFirst(){
        if(head == null){
            System.out.println("Nothing's there to delete");
            return -1;
        }
        int value = head.val;
        head = head.next;

//        if(head == null) tail == null;

        size--;
        return value;
    }

    public int deleteEnd(){
        if(head == null){
            System.out.println("Nothing's there to delete");
            return -1;
        }

        if(size <= 1) {
            return deleteFirst();
        }
        //find tail


        Node endPrev = head;

        //going to the tail.prev
//can do this  ↓
        endPrev = fetchIndex(size - 1);
//or this ↓
//        for(int i = 0; i < size - 2; i++){ //size - 2 is the index of 2nd last element
//            endPrev = endPrev.next;
//        }
        int val = endPrev.next.val;
        endPrev.next = null;

        size--;
        return val;
    }

    public int deleteAt(int index){
        if(index == 0)
            return deleteFirst();

        if(index == size-1)
            return deleteEnd();

        if(index >= size){
            System.out.println("Nothing to delete bro");
            return -1;
        }


        Node indexPrev = fetchIndex(index);
        int val = indexPrev.next.val;
        indexPrev.next = indexPrev.next.next;

        size--;
        return val;
    }


    private Node fetchTail(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }



    public Node findNode (int val){
        Node temp = head;
        while (temp != null) {
            if(temp.val == val)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public int findIndex(int val){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.val == val){
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }


    private Node fetchIndex(int index){
        Node indexPrev = head;
        int i = 1;
        while (i < index) {
            indexPrev = indexPrev.next;
            i++;
        }
        return indexPrev;
    }



    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null" + size);
    }
//questions
    public void removeDuplicates(){
        Node temp = head;
        while (temp.next != null) {
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
                size--;
            }
            else temp = temp.next;
        }

    }

















///  a box which has only value and reference of next box
    private class Node{
        private int val;
        private Node next;


        public Node (int value){
            this.val = value;
        }

        public Node(int value, Node next){
            this.val = value;
            this.next = next;
        }

//    @Override
//    public String toString() {
//        return "Node{val=" + val + "}";
//    }

    }

    //MERGING BY CREATING AN ANSWER LINKEDLIST

    public LinkedList merge(LinkedList l1, LinkedList l2){
        Node f = l1.head;
        Node s = l2.head;

        LinkedList ans = new LinkedList();
        while (f != null && s != null) {
            if(f.val < s.val){
                ans.insertEnd(f.val);
                f = f.next;
            }
            else{
                ans.insertEnd(s.val);
                s = s.next;
            }

        }
        while(f != null){
            ans.insertEnd(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertEnd(s.val);
            s = s.next;
        }

        return ans;
    }



/// MERGE 2 SORTED LISTS WITHOUT CREATING NEW LINKEDLIST uncomment all to see how it works
/*
public Node merge(Node head1, Node head2){
      if(head1 == null)
          return head2;

    Node temp1 = head1;
    Node temp2 = head2;

    Node node = new Node(-1); //a temp node
    head = node; //consider this node as head

    while (temp1 != null && temp2 != null) {
        if(temp1.val < temp2.val){
            node.next = temp1;
            temp1 = temp1.next;
        }
        else {
            node.next = temp2;
            temp2 = temp2.next;
        }
        node = node.next;
    }

    while(temp1 != null){
        node.next = temp1;
        temp1 = temp1.next;

        node = node.next;
    }
    while(temp2 != null){
        node.next = temp2;
        temp2 = temp2.next;

        node = node.next;
    }


    return head.next;


}
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
//        LL.insertEnd(1);
//        LL.insertEnd(2);
        LL.insertEnd(4);
//        LL.insertEnd(43);

        LinkedList LL2 = new LinkedList();

//        LL2.insertEnd(1);
//        LL2.insertEnd(3);
//        LL2.insertEnd(4);

        LL.display();
        System.out.println();
        LL2.display();

        Node merge = LL2.merge(LL.head, LL2.head);

        while(merge != null){
            System.out.print(merge.val + " -> ");
            merge = merge.next;
        }
        System.out.println("null");

    }
 */
/// MERGING IS DONE

//    https://leetcode.com/problems/linked-list-cycle-ii/  to verify the below code use leetcode
/// FAST AND SLOW POINTER METHOD TO FIND CYCLE IN A LINKEDLIST
/*
    public boolean checkCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
*/

    /// CYCLECHECK IS DONE

    /// LENGTH OF THE CYCLE
/*
    public boolean checkCycle(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = slow.next;
                int length = 1;
                while (slow != fast) {
                    slow = slow.next;
                    length++;
                }
                return true;
            }
        }
        return false;
    }
*/
    /// END OF LENGTH OF CYCLE

    /// FINDING INITIAL NODE OF THE CYCLE
    /*
    public Node  detectCycle(Node head){
        Node fast = head;
        Node slow = head;
        int length = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = slow.next;
                length = 1;
                while (slow != fast) {
                    slow = slow.next;
                    length++;
                }
                break; //loop must be broken manually as the linkedlist has a cycle
            }
        }//till here we found length of cycle

        if(length != 0){
            fast = head;
            slow = head;
            int i = 0;
            while (i < length) {
                fast = fast.next;
                i++;
            }

            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }
        return null;
    }

    */

    /// FINDING MIDDLE OF THE LINKED LIST IN SINGLE PASS
    /*
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
     */

    /// MERGE SORT
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = middleNode(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left, right);
    }
    public Node merge(Node head1, Node head2){
        if(head1 == null)
            return head2;

        Node temp1 = head1;
        Node temp2 = head2;

        Node node = new Node(-1); //a temp node
        head = node; //consider this node as head

        while (temp1 != null && temp2 != null) {
            if(temp1.val < temp2.val){
                node.next = temp1;
                temp1 = temp1.next;
            }
            else {
                node.next = temp2;
                temp2 = temp2.next;
            }
            node = node.next;
        }

        while(temp1 != null){
            node.next = temp1;
            temp1 = temp1.next;

            node = node.next;
        }
        while(temp2 != null){
            node.next = temp2;
            temp2 = temp2.next;

            node = node.next;
        }
        return head.next;
    }
    public Node middleNode(Node head){
        //need to find mid-1 node and store its next in mid
        //change mid -1.next to null
        //head 1 -> 2 -> 4 -> 43 -> 1 -> 2 -> 3 -> null this to this
        //head  -> 1  -> 2  -> 4 -> null, mid  -> 43 -> 1 -> 2 -> 3 -> null

//        Node midPrev = null;
//
//        while(head != null && head.next != null){
//            if(midPrev == null)
//                midPrev = head;
//            else midPrev = midPrev.next;
//            head = head.next.next;
//        }
//        Node mid = midPrev.next;
//        midPrev.next = null;
//        return mid;

/// method 2
        //find size
        Node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        //find mid-1 element i.e size/2 -1
        int i = 1;
        temp = head;
        while(i < (size/2)-1){
            temp = temp.next;
            i++;
        }
        //break connection bw mid-1 and mid
        Node mid = temp.next;
        temp.next = null;
        return mid;

    }
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
//        LL.insertEnd(1);
//        LL.insertEnd(2);
//        LL.insertEnd(4);
//        LL.insertEnd(43);

//        LL.insertEnd(1);
//        LL.insertEnd(3);
//        LL.insertEnd(4);

        LL.display();


        Node merge = LL.mergeSort(LL.head);

        while(merge != null){
            System.out.print(merge.val + " -> ");
            merge = merge.next;
        }
        System.out.println("null");

    }




}
