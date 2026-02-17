import java.util.Arrays;
class Solution {
    public static boolean canPlace(int[] stalls, int cows, int dist) {
        int count = 1;              
        int last = stalls[0];       
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                count++;
                last = stalls[i];
                if (count >= cows) {
                    return true;   
                }
            }
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(stalls, cows, mid)) {
                ans = mid;      
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }
        return ans;
    }
}
