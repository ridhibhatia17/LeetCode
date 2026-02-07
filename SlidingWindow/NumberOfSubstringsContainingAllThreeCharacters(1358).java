class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0,left=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                count+=n-right;
                char leftch=s.charAt(left);
                map.put(leftch,map.get(leftch)-1);
                left++;
            }
        }
        return count;
    }
}