package easy;

public class RotateArrayRecurse {
    public static void main(String[] args){
        int arr[] = new int[]{3,7,8,9,10,11};
        int n = arr.length;
        int k =3;
        rotateArray(arr, n, k);
        for(int i=0; i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void rotateArray(int arr[], int n, int k){
        reverse(arr, 0, n-k-1 );
        reverse(arr, n-k, n-1);
        reverse(arr, 0,n-1);
    }

    public static void reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
