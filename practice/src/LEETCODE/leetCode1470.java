package LEETCODE;

public class leetCode1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        shuffle(nums,3);
    }
    static int [] shuffle(int[] nums, int n){
        int[] ans = new int[n*2];
        int i =0,j=0;
        while(i < nums.length){
            if(i%2==0)
                ans[i] = nums[j++];
            else{
                ans[i] = nums[n];
                n++;
            }
            i+=1;
        }
    return ans;}

    static int[] shuffle2(int[] nums, int n){
        int[] ans=new int[nums.length];
        for(int i=0,j=0;i<nums.length;i++){
            if(i%2==0) ans[i]=nums[j++];
            else{
                ans[i]=nums[n];
                n++;
            }
        }
        return ans;
}

}

