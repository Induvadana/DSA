public class CountDigitsInNumber {

    public static void main(String[] args){
        int num =123;
        System.out.println(coundDigits(num));
    }

    public static int coundDigits(int n){
        int count =0;
        if(n==0){
            return 1;
        }
        while(n>0){
          //  int lastDigit = n%10;
            n = n/10;
            count = count+1;
        }
       return count;
    }
}
