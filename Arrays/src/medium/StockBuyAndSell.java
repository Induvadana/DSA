package medium;

public class StockBuyAndSell {
    public static void main(String[] args){
        int[] arr = new int[]{7,1,5,3,6,4};
        int profit = 0;
        int n = arr.length;
        int buy = arr[0];
        for(int i=1; i<n-1; i++){
            if(arr[i] < buy){
                buy = arr[i];
            }else if(arr[i]-buy > profit){
                profit = arr[i]-buy;
            }
        }
        System.out.println("Max Profit : "+profit);
    }
}
