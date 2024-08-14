package medium;

import java.util.HashSet;
import java.util.Set;

public class LongConsectiveSequence {
    public static void main(String[] args){
        int nums[] = new int[]{100,4,200,1,3,2};
        int n = nums.length;
        if(n==0){
            System.out.println(0);
        }
        int longest =1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        for(int i : set){
            if (!set.contains(i - 1)) {
                int count =1;
                int x = i;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println(longest);
    }
}
