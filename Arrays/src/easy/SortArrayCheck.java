package easy;

public class SortArrayCheck {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,1};
        int n = nums.length;
        System.out.println(checkSortArray(nums, n));
    }

    public static boolean checkSortArray(int[] nums, int n){
        for(int i=1; i< n; i++){
            if(nums[i] < nums[i-1])
                return false;
        }
        return true;
    }
}
