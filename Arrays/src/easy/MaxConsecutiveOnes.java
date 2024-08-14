package easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = new int[]{0,0};
        int n = nums.length;
        System.out.println("Max consecutive ones : "+ findMaxConsecutiveOnes(nums, n));
    }
    public static int findMaxConsecutiveOnes(int[] arr, int n) {
       int count = 0;
       int max_count = 0;
       for(int i=0;i<n;i++){
           if(arr[i] == 1)
               count++;
           if(arr[i] ==0 )
               count=0;
           if(count > max_count)
               max_count++;
       }
       return max_count;
    }
}
