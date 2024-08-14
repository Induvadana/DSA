package medium;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        ArrayList<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int row_start = 0;
        int row_end = row-1;
        int col_start =0;
        int col_end = col-1;
        boolean right = true, left =false, up=false, down =false;

        while(row_start<= row_end && col_start <= col_end){
            if(right){
                for(int i= col_start; i<=col_end; i++){
                    list.add(matrix[row_start][i]);
                }
                row_start++;
                right= false;
                down =true;
            }
            else if(down){
                for(int i=row_start; i<=row_end; i++){
                    list.add(matrix[i][col_end]);
                }
                col_end --;
                down = false;
                left = true;
            }
            else if(left){
                for(int i=col_end; i>=col_start; i--){
                    list.add(matrix[row_end][i]);
                }
                row_end--;
                left = false;
                up= true;
            }
            else if(up){
                for(int i= row_end;i>=row_start;i--){
                    list.add(matrix[i][col_start]);
                }
                col_start++;
                up=false;
                right =true;
            }
        }
        list.forEach(System.out::println);
    }
}
