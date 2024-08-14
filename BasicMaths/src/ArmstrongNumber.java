public class ArmstrongNumber {
    public static void main(String[] args){
        int n =12;
        int num =n;
        double arms = 0;
        while(n>0){
            double lastDigit = n%10;
            arms = (arms+ Math.pow(lastDigit, 3));
            n = n/10;
        }
        if(arms == num){
            System.out.println("Is Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
