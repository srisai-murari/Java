package Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        CStack stack = new CStack();

        stack.push(19);
        stack.push(20);
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(25);
        stack.push(15);
        stack.push(23);
        stack.push(245);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        System.out.println(stack.peek());

        //dynamic stack implementation
        DynamicStack ds = new DynamicStack();

        //or

//        CStack ds = new DynamicStack();
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);
        ds.push(19);


    }


}
