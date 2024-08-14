import java.util.HashMap;
import java.util.Map;

public class SumHighLowFreq {
    public static void main(String[] args){
        int nums[] = new int[]{10, 9, 7, 7, 8, 8, 8};
        System.out.println(sumofHighLowElem(nums));
    }

    public static int sumofHighLowElem(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        //This logic failed for test cases
        int max = 0;
        int min = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue() > max){
                max = entry.getValue();
            }
            if((min == -1) || (entry.getValue() < min)){
                min = entry.getValue();
            }
        }

    return (max+min);

    }
}
