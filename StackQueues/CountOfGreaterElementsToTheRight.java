public class Solution {
    public static int[] countGreater(int []arr, int []query) {
        int n = arr.length;
        int m = query.length;
        int[] ans = new int[m];
        for(int i = 0; i < m; i++){
            int idx = query[i];
            int count = 0;
            for(int j = idx + 1; j < n; j++){
                if(arr[j] > arr[idx]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}