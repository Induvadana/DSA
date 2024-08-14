public class CountOddDigit {
    public static void main(String[] args){
        int num =15;
        System.out.println(countOddDigit(num));
    }
    public static int countOddDigit(int n) {
        int count=0;
        while(n>0){
            int lastDigit= n%10;
            n = n/10;
            if(lastDigit%2 !=0){
                count++;
            }
        }
        return count;
    }
}
