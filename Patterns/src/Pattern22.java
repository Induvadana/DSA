public class Pattern22 {
    public static void main(String[] args){
        int n=5;
        for(int i=0; i<=(2*n)-2; i++){
            for(int j=0; j<=(2*n)-2;j++){
                int top=i;
                int bottom = j ;
                int left=(2*n-2)-i;
                int right = (2*n-2)-j;
                System.out.print((n - Math.min(Math.min(top,bottom), Math.min(left,right)))+" ");
            }
            System.out.println();
        }
    }
}
