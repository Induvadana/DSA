import java.util.HashMap;
import java.util.Map;

public class SecondHighOccuElement {
    public static void main(String[] args){
        int nums[] = new int[]{4, 4, 5, 5, 6, 7};
        System.out.println(secondHighElement(nums));
    }

    public static int secondHighElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
           map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        //This logic failed for test cases
        int max = 0;
        int min = 0;
        int minKey =-1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           if(entry.getValue() > max){
               min = max;
               max = entry.getValue();
           }else if(entry.getValue() > min && entry.getValue() < max){
               min = entry.getValue();
           }
        }
        if(min == 0)
            return -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == min){
                if(minKey == -1 || entry.getKey() < minKey){
                    minKey = entry.getKey();
                }
            }
        }
        return minKey;
    }
}
