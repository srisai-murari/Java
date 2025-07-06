package LinkedListsR;

public class Main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
//
//        LL.insertAt(0,1222);
//
//
//
//
//        LL.insertEnd(192);
//
//        LL.insertFirst(19);
//        LL.insertFirst(12);
//        LL.insertFirst(14);
//        LL.insertFirst(195);
//        LL.insertEnd(122);
//
//        LL.insertAt(4,1232);
//
////        LL.insertAt(9, 94);
//
//        LL.display();
//        System.out.println(LL.deleteFirst());
//        LL.display();
//
//        System.out.println(LL.deleteEnd());
//        LL.display();
//
//        System.out.println(LL.deleteAt(5));
//
//
//        LL.display();
//
//        System.out.println(LL.findIndex(12));
//
//        System.out.println(LL.findNode(12));
//
//        LL.recInsertAt(0,41);

//
//        LL.insertEnd(1);
//        LL.insertEnd(1);
//        LL.insertEnd(1);
////        LL.insertEnd(3);
////        LL.insertEnd(3);
////        LL.insertEnd(5);
//        LL.removeDuplicates();

        LL.insertEnd(1);
        LL.insertEnd(2);
        LL.insertEnd(4);

        LinkedList LL2 = new LinkedList();

        LL2.insertEnd(1);
        LL2.insertEnd(3);
        LL2.insertEnd(4);
        LL2.insertEnd(5);

        LL.display();
        System.out.println();
        LL2.display();


        LinkedList ans = LL.merge(LL, LL2);
        ans.display();





    }
}
