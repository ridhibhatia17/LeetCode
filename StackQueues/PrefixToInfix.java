import java.util.*;
public class Solution {
    public static String prefixToInfixConversion(String exp) {   
        Stack<String> st = new Stack<>();
        for(int i = exp.length()-1; i >= 0; i--){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String a = st.pop();
                String b = st.pop();
                
                String temp = "(" + a + ch + b + ")";
                st.push(temp);
            }
        }
        return st.pop();
    }
}