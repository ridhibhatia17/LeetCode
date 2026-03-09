class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-curr){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==-curr){
                    st.pop();
                }
                else if (st.isEmpty() || st.peek() < 0) {
                    st.push(curr); // safe to push
                }
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}