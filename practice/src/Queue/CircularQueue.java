package Queue;
//to overcome O(N) complexity for deleting an item from queue we use circular queue
public class CircularQueue {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int rear = 0;
    protected int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    protected boolean isFull(){
//        return front == rear + 1;
        return size == data.length;
    }


    private boolean isEmpty(){
//        return front == rear;
        return size == 0;
    }


    public boolean insert(int val) throws QueueException{
        if(isFull())
            throw new QueueException("Chinna queue lo kaali ledhu");
//        rear = rear % data.length;
        data[rear++] = val;
        rear = rear % data.length;
        size++;
        return true;
    }

    public int remove() throws QueueException{
        if(isEmpty())
            throw new QueueException("Kaali ga unna dhantlo em teesthaav ra");

        int removed = data[front++];
        front = front % data.length;
        size--;

        return removed;
    }

    public int front () throws QueueException{
        if(isEmpty())
            throw new QueueException("Mundhu evaru leru");
        return data[front];
    }

    public void display() throws QueueException{
        if(isEmpty())
            throw new QueueException("Ikkada choopinchadaaniki em ledhu ra");
        int i = front;
        do{
            System.out.println(data[i] + " <- ");
            i++;
            i = i % data.length;
        }while(i != rear);
    }



}
