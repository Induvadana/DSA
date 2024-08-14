package hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleOptimal {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> output = generatePascalTriangle(n);
        for (List<Integer> integers : output) {
            integers.forEach(System.out::println);
        }
    }
    public static List<List<Integer>> generatePascalTriangle(int n) {
        List<List<Integer>> output = new ArrayList<>();
        for(int row=1; row<=n;row++){
            output.add(generateRow(row));
        }
        return output;
    }

    public static List<Integer> generateRow(int row){
        long ans=1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int col=1; col<row; col++){
            ans = ans*(row-col);
            ans = ans/col;
            list.add((int)ans);
        }
        return list;
    }
}
