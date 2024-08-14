public class Pattern11 {
    public static void main(String[] args){
        int n=5;
        int index=1;
        for(int i=0; i<n;i++){
            if(i%2 ==0){
                index=1;
            }else {
                index=0;
            }
            for(int j=0; j<=i;j++){
                System.out.print(index);
                index = 1-index;
            }
            System.out.println();
        }
    }
}
