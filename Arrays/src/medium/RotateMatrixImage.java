package medium;

public class RotateMatrixImage {
    public static void main(String[] args){
        int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = nums.length; //row
        int m = nums[0].length; //column
        rotateMatrix(nums, n, m);
        for(int i =0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] nums, int n, int m){
        //transpose Matrix -> changing rows to columns & columns to rows
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
        //reverse only each row
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = 0;
                temp = nums[i][j];
                nums[i][j] = nums[i][n-1-j];
                nums[i][n-1-j] = temp;
            }
        }
    }
}
