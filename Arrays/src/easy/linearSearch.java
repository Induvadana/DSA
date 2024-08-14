package easy;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{5,4,3,2,1};
        int n = arr.length;
        int k =3;
        for(int i=0; i< n; i++){
            if(arr[i] == k) {
                System.out.println(i);
            }
        }
    }
}
