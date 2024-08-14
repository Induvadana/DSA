package easy;

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = nums.length; //row
        int m = nums[0].length; //column
        transpose(nums, n, m);
        for(int i =0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][]nums, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=i+1; j<m;j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }
}
