class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
                
            }else if(nums[mid]<target){
                low = mid+1;

            }else{
                high = mid-1;
            }
            //ans = Math.min(target-ans,target-ans1);
        }
        return low;
    }
}