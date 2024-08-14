package medium;

public class SubArraySumEqualsK {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1};
        int k=2;
        int n = nums.length;

        int count = 0;

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=i; j<n;j++) {
                sum = sum + nums[j];
                if (sum == k ) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
