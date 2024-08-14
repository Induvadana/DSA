public class SumOfDigits {
    public static void main(String[] args){
        int n =38;
        System.out.println(digitsSum(n));


    }

    public static int digitsSum(int n){
        if(n <= 0)
            return 0;
        else{
            int lastDigit = n%10;
            int sum = lastDigit+digitsSum(n/10);
            if(sum/10 > 0){
               return digitsSum(sum);
            }else{
                return sum;
            }
        }

    }
}
