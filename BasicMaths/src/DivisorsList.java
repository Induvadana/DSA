import java.util.Arrays;

public class DivisorsList {
    public static void main(String[] args){
        int n=7;
        int[] op= new int[n];
        int k=0;
        for(int i=1; i<=n;i++){
            if(n%i== 0){
                op[k] = i;
                k++;
            }
        }
        int output[] = Arrays.copyOf(op,k);
        for(int i=0; i<output.length;i++){
            System.out.println(output[i]);
        }
    }
}
