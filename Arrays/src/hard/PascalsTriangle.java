package hard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> output = generatePascalTriangle(n);
        for (List<Integer> integers : output) {
            integers.forEach(System.out::println);
        }
    }

    public static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> output = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            List<Integer> list = new ArrayList<>();
            for (int col = 1; col <= row; col++) {
                list.add(ncr(row - 1, col - 1));
            }
            output.add(list);
        }
        return output;
    }

    public static int ncr(int r, int c){
     long res =1;
     for(int i=0; i<c; i++){
         res =  res*(r-i);
         res = res/(i+1);
     }
     return (int)res;
    }
}
