class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while(low<=high){
            int mid = low+(high-low)/2;
            long totalH = calculateHour(piles,mid);
            if(totalH<=h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    long calculateHour(int[] piles,int hourly){
        long totalH = 0;
        int n = piles.length;
        for(int i = 0;i<n;i++){
            totalH += (long)Math.ceil((double)piles[i]/hourly);
        }
        return totalH;

    }
    int findMax(int[] piles){
        int max = piles[0];
        int n = piles.length;
        for(int i =0;i<n;i++){
            max = Math.max(max,piles[i]);

        }
        return max;
    }
}