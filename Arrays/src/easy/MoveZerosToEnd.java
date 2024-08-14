package easy;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int arr[] = new int[]{2,1};
        int mod[] = modifiedArray(arr);
        for(int i=0; i< arr.length; i++){
            System.out.println(mod[i]);
        }
    }
    public static int[] modifiedArray(int[] nums){
        int n = nums.length;
        int j =-1;
        for(int i=0; i<n;i++){
            if(nums[i] ==0) {
                j = i;
                break;
            }
        }
        if(j==-1){
            return nums;
        }
        for(int i =j+1; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
