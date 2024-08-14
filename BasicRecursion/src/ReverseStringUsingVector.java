import java.util.Vector;

public class ReverseStringUsingVector {
    public static void main(String[] args){
        Vector<Character> s = new Vector<>();
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        int left = 0;
        int right = s.size()-1;
        reverseString(s,left, right);
        System.out.println(s);
    }

    public static void reverseString(Vector<Character> st, int left, int right) {
       if(left >= right){
            return ;
       }else{
           char ch = st.get(left);
           st.set(left, st.get(right));
           st.set(right, ch);
           reverseString(st, left+1, right-1);
       }

    }

}
