package Stack;

public class DynamicStack extends CStack{
    public DynamicStack (){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int val) throws Exception {
        if(this.isFull()) {
            int [] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++)
                temp[i] = data[i];
            data = temp;
        }

        return super.push(val);
    }


}
