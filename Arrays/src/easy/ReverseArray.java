package easy;

public class ReverseArray {
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3,4,5};
        int n = arr.length;
        int op[] = new int[n];
        int k=0;
        for(int i=n-1; i>=0; i--){
            op[k]= arr[i];
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.println(op[i]);
        }
    }
}
