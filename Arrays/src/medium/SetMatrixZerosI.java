package medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZerosI {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n =matrix.size();
        int m = matrix.get(0).size();
        ArrayList<ArrayList<Integer>> output = setZeroMatrix(matrix,n,m);
        for(ArrayList<Integer> row: output){
            for(Integer col : row) {
                System.out.println(col + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> setZeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n,int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                if(matrix.get(i).get(j) == 0){
                    setRow(matrix, n, m, i);
                    setCol(matrix, n, m, j);
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m ; j++){
                if(matrix.get(i).get(j) == -1){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }

    public static void setRow(ArrayList<ArrayList<Integer>> matrix, int n, int m, int i){
        for(int j=0; j<m; j++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
        }
    }

    public static void setCol(ArrayList<ArrayList<Integer>> matrix, int n, int m, int j){
        for(int i=0; i<n; i++){
            if(matrix.get(i).get(j) != 0){
                matrix.get(i).set(j, -1);
            }
        }
    }

}
