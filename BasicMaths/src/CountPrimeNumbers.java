public class CountPrimeNumbers {
    public static void main(String[] args){
        int n=6;
        int sum=0;
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
               sum++;
            }
        }
        System.out.println(sum);

    }
    public static boolean isPrime(int n ){
        int count=0;
        for(int i=1;i<=n;i++) {
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
           return true;
        }else {
            return false;
        }
    }
}
