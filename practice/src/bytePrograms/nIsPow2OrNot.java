package bytePrograms;

public class nIsPow2OrNot {
    public static void main(String[] args) {
        int twothPower = 34;
        int flag = 0,count = 0;
        while(twothPower != 0){
            int bit = twothPower & 1;
            if(bit == 1)
                count++;
            if(count > 1){
                flag = 1;
                break;
            }
            twothPower = twothPower >> 1;

        }
        System.out.println(flag==1 ? "Not a power of 2": "yes a power of 2");

    }
}
