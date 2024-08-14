package easy;

import java.util.*;

public class FindUnion {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,6,7};
        int n = arr1.length;
        int m = arr2.length;
        //solution1 using maps
        ArrayList<Integer> union = findUnionUsingMaps(arr1, arr2, n, m);
    //    union.forEach(System.out::println);
        //solution2 using Set
        ArrayList<Integer> set = findUnionUsingSet(arr1, arr2, n, m);
        set.forEach(System.out::println);
        //solution3 using two-pointers
        findUnionUsingTwoPointers(arr1, arr2);
    }

    public static ArrayList<Integer> findUnionUsingMaps(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> unionMap = new HashMap<>();
        for(int i=0; i<n;i++){
           unionMap.put(arr1[i], unionMap.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0; i<m;i++){
            unionMap.put(arr2[i], unionMap.getOrDefault(arr2[i],0)+1);
        }
        for(int i : unionMap.keySet()){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
    public static ArrayList<Integer> findUnionUsingSet(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<m; i++){
            set.add(arr2[i]);
        }
        for(int i : set){
            list.add(i);
        }
        Collections.sort(list);
        return list;
    }
    public static void findUnionUsingTwoPointers(int[] arr1, int[] arr2){

    }
}
