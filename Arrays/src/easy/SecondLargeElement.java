package easy;

public class SecondLargeElement {
    public static void main(String[] args) {
        int arr[] = new int[]{12, 35, 1, 10, 34, 1};
        int n = arr.length;
        System.out.println("Second Largest ELement is : "+ secondLargeElement(arr, n));
    }

    public static int secondLargeElement(int arr[], int n){
       for(int i=0; i<n;i++){
           for(int j =i+1; j<n; j++) {
               if(arr[i] > arr[j]) {
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }
       }
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }
        return arr[n-2];
    }
}
