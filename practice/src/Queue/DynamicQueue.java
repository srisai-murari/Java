package Queue;

import java.util.MissingFormatArgumentException;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    public boolean insert(int val) throws QueueException {
        if(isFull()){
            int [] temp = new int[data.length * 2];

            //copy elements into new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            rear = data.length;
            data = temp;
        }
        return super.insert(val);
    }

}
