package easy;

public class LongestSubArray {
    public static void main(String[] args){
        int arr[] = new int[]{10, 5, 2, 7, 1, 9};
        int k=15;
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            int sum = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                sum += arr[j];

                if (sum == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        System.out.println(len);
    }
}
