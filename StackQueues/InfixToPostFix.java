import java.util.*;
class Solution {
    static int op(char ch){
        if(ch=='^') return 3;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    public static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && st.peek()!='(' &&
                     (op(st.peek()) > op(ch) || 
                     (op(st.peek()) == op(ch) && ch!='^'))){
                    
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
}