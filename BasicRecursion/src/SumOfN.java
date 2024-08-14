public class SumOfN {
    public static void main(String[] args){
        int n =4;
        System.out.println(sumNumbers(n));
    }

    public static int sumNumbers(int n){
        System.out.println(n + " recursive call");
       if(n == 0)
           return 0;
       int sum = n+ sumNumbers(n-1);
       System.out.println("sum = "+sum);
       return sum;
    }
}
