import java.util.*;
public class Solution {
    public static String preToPost(String s) {
        // Write Your Code Here
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a=st.pop();
                String b=st.pop();
                String temp=a+b+ch;
                st.push(temp);
            }
        }
        return st.pop();
    }
}