class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0,maxlen=0,freq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            freq=Math.max(freq,map.get(ch));
            while((right-left+1)-freq>k){
                char leftch=s.charAt(left);
                map.put(leftch,map.get(leftch)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}