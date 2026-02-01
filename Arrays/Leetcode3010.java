class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int f=nums[0];
        int num[]=new int[n-1];
        for(int i=1;i<n;i++){
            num[i-1]=nums[i];
        }
        Arrays.sort(num);
        return f+num[0]+num[1];
    }
}