class Solution {
    public boolean possible(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int noOfB = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m * k;
        if (val > bloomDay.length) return -1;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int d : bloomDay) {
            mini = Math.min(mini, d);
            maxi = Math.max(maxi, d);
        }
        int low = mini, high = maxi;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;   
            } else {
                low = mid + 1;    
            }
        }
        return ans;
    }
}
