package medium;

public class RearrangeElemBySign {
    public static void main(String[] args){
        int nums[] = new int[]{3,1,-2,-5,2,-4};
        int n = nums.length;
        int op[] = new int[n];
        int pos =0;
        int neg =1;
        for(int i=0; i<n;i++){
            if(nums[i] <0 ){
                op[neg] = nums[i];
                neg +=2;
            }else {
                op[pos] = nums[i];
                pos += 2;
            }
        }
        for (int i : op) {
          System.out.println(i);
        }
    }
}
