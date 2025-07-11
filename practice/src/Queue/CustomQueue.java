package Queue;

public class CustomQueue {
    private int [] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int [size];
    }

    public boolean isFull(){
        return data.length == end;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int val){
        if(isFull()){
            System.out.println("kaali ledh");
            return false;
        }

        data[end++] = val;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty())
            throw new Exception("akkada em undhi ani teeyadaaaniki");

        int removed = data[0];
//        now shift elements from end to 0
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front(){
        if(isEmpty())
            System.out.println("Mundhu evar leru");
        return data[0];
    }

    public void display(){
        if(isEmpty())
            System.out.println("Akkada print cheyyadaaniki em ledhu");

        System.out.print("[");
        for (int i = 0; i < end -1; i++) {
            System.out.print(data[i] + ", ");
        }

        System.out.println(data[end - 1]  + "]");
    }



}
