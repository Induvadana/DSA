public class ReverseString {
    public static void main(String[] args){
        String st = "hello";
        System.out.println(reverseString(st));
    }

    public static String reverseString(String st){
        if(st.isEmpty()){
            return st;
        }else{
           return reverseString(st.substring(1))+st.charAt(0);
        }
    }
}
