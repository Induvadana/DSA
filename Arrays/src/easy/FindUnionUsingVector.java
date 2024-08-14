package easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class FindUnionUsingVector {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,6,7};
        int n = arr1.length;
        int m = arr2.length;
        Vector<Integer> vector = findUnion(arr1, arr2, n,m);
    }

    public static Vector<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        Vector<Integer> vector = new Vector<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            set.add(arr2[i]);
        }
       for(int i: set){
           vector.add(i);
       }
        return vector;
    }
}
