package medium;

import java.security.Permission;
import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int nums[] = new int[]{3,2,1};
        int n = nums.length;
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(0, nums, result);

    }

    public static void permutation(int i, int[] nums, List<List<Integer>> result)
    {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        if (i >= n - 1) {
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
        } else {
            for (int j = i, l = n; j < n; j++) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                permutation(i + 1, nums, result);
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
    }

}
