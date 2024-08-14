public class GCD {
    public static void main(String[] args){
        int n1= 6;
        int n2=12;
        int gcd =0;
        for(int i=n1;i>=1;i--){
            if(n1%i == 0){
                if(n2%i == 0){
                    gcd = i;
                    break;
                }else{
                    continue;
                }
            }
        }
        System.out.println(gcd);
    }
}
