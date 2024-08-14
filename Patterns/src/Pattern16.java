public class Pattern16 {
    public static void main(String[] args){
        int n =5;
        int sum =1;
       for(char ch='A';ch<='A'+(n-1); ch++){
           for(int i=1; i<=sum;i++){
               System.out.print(ch);
           }
            sum= sum+1;
           System.out.println();
       }
    }
}
