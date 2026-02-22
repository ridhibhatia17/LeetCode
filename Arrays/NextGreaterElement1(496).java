class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        for(int i = 0; i < n; i++){
            int target = nums1[i];
            int ans = -1;
            for(int j = 0; j < m; j++){
                if(nums2[j] == target){
                    for(int k = j + 1; k < m; k++){
                        if(nums2[k] > target){
                            ans = nums2[k];
                            break;
                        }
                    }
                    break; 
                }
            }          
            nums1[i] = ans;
        }
        return nums1;
    }
}