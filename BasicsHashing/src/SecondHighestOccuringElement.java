import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccuringElement {
    public static void main(String[] args) {
        int nums[] = new int[]{10, 9 ,7, 7};

        System.out.println(secondHighElement(nums));
    }

    public static int secondHighElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;  int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                count = 0;
                map.put(nums[i], count + 1);
            } else {
                if (map.get(nums[i]) != null) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            }
        }
        //This logic failed for test cases
        int max =0;
        int key =0;
        int min =-1;
        int minKey = 0;
        int len = map.size();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(len > 0){
               min = max;
               if(minKey == 0){
                   minKey = entry.getKey();
               }else{
                   minKey = key;
               }
                key = entry.getKey();
               max = entry.getValue();
            }
            if(min < 0){
                return -1;
            }
            len--;
        }
        return minKey;
    }
}
