class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        int[] temp = new int[n];

        for (int j = 0; j <n; j++) {
                temp[(j+k)%n]=nums[j];
        }
        for(int i = 0;i<n;i++){
            nums[i] = temp[i];
        }

        //nums[0] = temp;
        //i++;
    }
}