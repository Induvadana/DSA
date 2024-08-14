/*
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = new String[]{"flower","flow","flight"};
        int n = strs.length;
        String str = "";
        for(int i=0; i< strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j=1; j<n; j++){
                if(i==strs[j].length() || strs[j].charAt(i) == c){
                    str = strs[0].substring(0, i);
                }
            }
        }
        System.out.println(str);
    }
}

