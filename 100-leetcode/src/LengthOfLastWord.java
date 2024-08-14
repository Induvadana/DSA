/*
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
public class LengthOfLastWord {
    public static void main(String[] args){
        String st = "   fly me   to   the moon  ";
        String str[] = st.split(" ");
        int n = str.length;
        System.out.println(str[n-1].length());

        //without using split function
        System.out.println(extracted(st));

    }

    private static int extracted(String st) {
        int n = st.length();
        // char[] ch = new char[n];
        int count =0;
        String s1= st.trim();
        for(int i=0; i<s1.length();i++){

            if (s1.charAt(i) == ' ') {
                count =0;
            }else{
                count++;
            }
        }
        return count;
    }
}
