public class Pattern7 {
    public static void main(String[] args){
        int n =5;
        int count =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0; k<count; k++){
                System.out.print("*");
            }
            System.out.println();
            count = count+2;
        }
    }
}
