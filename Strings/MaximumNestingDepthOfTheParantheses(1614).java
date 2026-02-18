class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxN=0;
        for(int c:s.toCharArray()){
            if(c=='('){
                count++;
                if(maxN<count){
                    maxN=count;
                }
            }else if(c==')'){
                count--;
            }
        }
        return maxN;
    }
}