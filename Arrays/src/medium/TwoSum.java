package medium;

public class TwoSum {
    public static void main(String[] args){
        int arr[] = new int[]{3,2,3};
        int n = arr.length;
        int target = 6;
        int op[] = new int[2];
        for(int i=0; i<n;i++){
          for(int j=i+1; j<n; j++) {
              if (arr[i]+arr[j] == target) {
                  int k = 0;
                  op[k] = i;
                  op[k + 1] = j;
                  break;
              }
          }
        }
       for(int i=0; i<op.length; i++){
           System.out.println(op[i]);
       }
    }
}
