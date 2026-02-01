class Solution {
    public int finalElement(int[] nums) {
        int m=nums.length;
        return Math.max(nums[0],nums[m-1]);
    }
}