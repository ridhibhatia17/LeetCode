import java.util.*;
public class Solution {
    public static String postfixToPrefix(String exp) {
        // Write your code here
        Stack<String> st=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }
            else{
                String op2=st.pop();
                String op1=st.pop();
                String temp=ch+op1+op2;
                st.push(temp);
            }
        }
        return st.peek();
    }
}