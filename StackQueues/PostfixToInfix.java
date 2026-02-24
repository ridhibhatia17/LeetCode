// User function Template for Java
import java.util.*;
class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else{
                String op1=st.pop();
                String op2=st.pop();
                String temp="("+op2+ch+op1+")";
                st.push(temp);
            }
        }
        return st.peek();
    }
}
