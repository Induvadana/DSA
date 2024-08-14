package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZerosII {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] output = setZeroMatrix(matrix, n, m);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(output[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] setZeroMatrix(int[][] matrix, int n, int m){
           int row[] = new int[n];
           int col[] =  new int[m];
            for(int i=0; i< n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] =1;
                    col[j] =1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] ==1 || col[j] ==1){
                    matrix[i][j] =0;
                }
            }
        }
        return matrix;
    }
}
      /*  ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        int n = matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> output = setZeroMatrix(matrix, n, m);
        for (ArrayList<Integer> row : output) {
            for (Integer col : row) {
                System.out.println(col + " ");
            }
            System.out.println();
        } */


 /*   public static ArrayList<ArrayList<Integer>> setZeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int row[] = new int[n];
        int col[] =  new int[m];
        for(int i=0; i< n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j) == 0){
                    row[i] =1;
                    col[j] =1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] ==1 || col[j] ==1){
                    matrix.get(i).set(j,0);
                }
            }
        }
       return matrix;
    }*/
