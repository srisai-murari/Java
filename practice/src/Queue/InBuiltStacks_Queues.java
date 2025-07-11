package Queue;
import java.util.*;
public class InBuiltStacks_Queues {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        stack.push(19);
        stack.push(20);
        stack.push(23);
        stack.push(24);
        stack.push(25);


        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        queue implements interfaces
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(50);


        queue.offer(3);
        System.out.println(queue);


        Deque<Integer> deque = new ArrayDeque<>();
        //array deque is a limit less 2 sided array
        // this has double ended functionality where elements can be removed from both sides of the array

    }
}
