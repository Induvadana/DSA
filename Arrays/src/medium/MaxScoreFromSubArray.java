package medium;

public class MaxScoreFromSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 1, 5, 6};

        //kadane's algorithm
        int n = arr.length;
        int sum = arr[0];
        int maxi = 0;
        for (int i = 1; i < n; i++) {
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            sum = arr[i];
        }
        System.out.println(maxi);
    }
}
