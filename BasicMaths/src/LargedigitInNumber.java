public class LargedigitInNumber {
    public static void main(String[] args){
        int n = 1;
        int largeDigit = 0;
        while(n>0){
            int lastDigit = n%10;
            if(lastDigit > largeDigit){
                largeDigit =  lastDigit;
            }
            n = n/10;
        }
        System.out.println(largeDigit);
    }
}
