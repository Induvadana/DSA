import java.util.*;

public class HighestOccuringElement {
    public static void main(String[] args){
     int nums[] = new int[]{4, 4, 5, 5, 6};
     int n = nums.length;
        Map<Integer, Integer> map= new HashMap<>();
        int count =0;
        int maxFreq = 0;
        int maxElem = 0;
     for(int i=0; i<n;i++){
         if(!map.containsKey(nums[i])){
             count =0;
             map.put(nums[i], count+1);
         }else{
             if(map.get(nums[i])!=null){
                 map.put(nums[i], map.get(nums[i])+1);
             }
         }
     }
     //Below is the easy way
   //  int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
     //System.out.println(key);
     //without using collections
     int max =0;
     int key =0;
     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
         if(entry.getValue() > max){
             max = entry.getValue();
             key =  entry.getKey();
         }
     }
        System.out.println(key);
    }
}
