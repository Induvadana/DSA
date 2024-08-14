package easy;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int arr[] = new int[]{3,7,8,9,10,11};
        int n = arr.length;
        int k =3;
        int d = n-k;
        int temp[] = new int[n];
        int m=0;
        if(d>0) {
            for (int i = d; i < n; i++) {
                temp[m] = arr[i];
                m++;
            }
            for (int i = 0; i < d; i++) {
                temp[m] = arr[i];
                m++;
            }
        }
        else {
            for(int i=0; i<n;i++){
                System.out.println(arr[i]);
            }
        }

        for(int i=0; i<n;i++){
            arr[i] = temp[i];
            System.out.println(arr[i]);
        }
    }
}
