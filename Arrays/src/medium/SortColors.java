package medium;

public class SortColors {
    public static void main(String[] args){
        int[] nums = new int[]{2,0,1};
        int n = nums.length;
        for(int i=0; i< n; i++){
            for(int j =i+1; j<n; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
