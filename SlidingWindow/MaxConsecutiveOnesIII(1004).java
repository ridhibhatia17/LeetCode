class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int countZero=0;
        int maxLen=0;
        int left=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) countZero++;
            while(countZero>k){
                if(nums[left]==0){
                    countZero--;
                }
                left++;
            }
            if(countZero<=k){
                int len=i-left+1;
                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}