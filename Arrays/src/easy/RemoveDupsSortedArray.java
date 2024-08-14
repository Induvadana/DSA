package easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsSortedArray {
    public static void main(String[] args){
        int nums[] = new int[]{1,1,2};
        int n = nums.length;
       Set<Integer> set = new HashSet();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
      //  nums = set.stream().mapToInt(Integer::intValue).toArray();
        set.forEach(System.out::println);
        System.out.println("size : "+set.size());

        //optimal approach
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println("optimal size : "+(i+1));
    }
}
