class Solution {
    private long calculateHours(int[] piles,int h){
        long hours=0;
        for(int bananas:piles){
            hours += (int)Math.ceil((double)bananas/h);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            if(piles[i]>maxPiles){
                maxPiles=piles[i];
            }
        }
        int left=1,right=maxPiles;
        int ans=maxPiles;
        while(left<=right){
            int mid=(left+right)/2;
            long hours=calculateHours(piles,mid);

            if(hours<=h){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}