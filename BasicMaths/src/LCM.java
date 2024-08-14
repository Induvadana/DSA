import java.util.ArrayList;

public class LCM {
    public static void main(String[] args){
        int n1=24;
        int n2=36;
        int lcm=0;
        for(int i=1; i<=n1;i++){
            if ((n2 * i) % n1 == 0) {
                lcm = n2 *i;
                break;
            } else {
                continue;
            }
        }
     System.out.println(lcm);
    }
}
