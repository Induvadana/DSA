package easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayUsingMaps {
    public static void main(String[] args){
        int arr[] = new int[]{10, 5, 2, 7, 1, 9};
        int k=15;
        int n = arr.length;
        int len = 0;
        int sum = 0;
        Map<Integer, Integer> subArrMap = new HashMap<>();
        for(int i=0; i<n;i++){
            sum += arr[i];
            if(sum == k) {
                len = Math.max(len, i + 1);
            }
            int rem = sum-k;
            if(subArrMap.containsKey(rem)){
                int l = i - subArrMap.get(rem);
                len = Math.max(len, l);
            }
            if (!subArrMap.containsKey(sum)) {
                subArrMap.put(sum, i);
            }
        }
       System.out.println(len);
    }
}
