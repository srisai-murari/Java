package Stack;

public class CStack {
    protected int [] data;

    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CStack(){
        this(DEFAULT_SIZE);
    }

    public CStack(int size){
        this.data = new int[size];
    }

    public boolean push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Adhi avvadh amma");
//            return false;
        }
        data[++ptr] = val;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty())
            throw new Exception("Akkada em ledh abba teeyadaaniki");

        return data[ptr--];

    }

    public int peek() throws Exception{
        if(isEmpty())
            throw new Exception("Akkadha chodataaniki em ledh amma");

        return data[ptr];

    }


    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return  ptr == -1;
    }


}
