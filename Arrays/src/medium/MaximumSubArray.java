package medium;

public class MaximumSubArray {
    public static void main(String[] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int n = nums.length;
        //kadane's algorithm

        int sum =0;
        int max = nums[0];
        for(int i=1; i<n-1; i++){
            sum = sum+nums[i];
            max = Math.max(max, sum);
            if(sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Max subArray sum : "+ max);
    }
}
