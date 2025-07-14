class BSrec{
    public static void main(String [] args){
        int [] arr = {1,2,4,6,7,8,13,54,67};

        int index = bsRec(arr, 0, arr.length - 1, 67);
        System.out.println(index);
        System.out.flush();
    }

    static int bsRec (int []arr, int s, int e, int target){
        if(s > e)
            return -1;

        int mid = s + (e - s) / 2;

        if(arr[mid] == target)
            return mid;

        else if(arr[mid] < target)
            return bsRec(arr, mid + 1, e, target);

        else
            return bsRec(arr, s, mid - 1, target);

        
    }
}