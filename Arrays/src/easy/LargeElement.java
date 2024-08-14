package easy;

public class LargeElement {
    public static void main(String[] args){
        int arr[] = new int[]{1,8,7,56,90};
        int n = arr.length;
        System.out.println("Largest Element : "+ largestElement(arr, n));
    }

    public static int largestElement(int[] arr, int n){
        int max =0;
        for(int i=0; i<n;i++){
             if(arr[i] > max) {
                 max = arr[i];
             }
         }
        return max;
    }
}
