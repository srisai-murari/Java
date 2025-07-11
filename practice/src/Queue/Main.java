package Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();


        queue.insert(19);
        queue.insert(12);
        queue.insert(13);
        queue.insert(11);
        queue.insert(43);
        queue.insert(154);
        queue.insert(132);
        queue.insert(139);
        queue.insert(1);
//        queue.insert(121);
        queue.insert(21);
        queue.insert(1219);
        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
