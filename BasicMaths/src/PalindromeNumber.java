public class PalindromeNumber {
    public static void main(String[] args){
        int n=  321;
        int num = n;
        int revNum = 0;
        while(n>0){
            int lastDigit = n%10;
            revNum = (revNum*10)+lastDigit;
            n = n/10;
        }
        if(revNum == num){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
