package medium;

public class MajorityElement {
    public static void main(String[] args){
        int nums[] = new int[]{2,2,1,1,1,2,2};
        int n = nums.length;
        int count = 0;
        int elem = 0;
        for(int i=0; i<n;i++){
            if(count == 0)
                elem = nums[i];
            if(elem == nums[i])
                count++;
            if(elem != nums[i])
                count--;
        }
       System.out.println(elem);
    }
}
