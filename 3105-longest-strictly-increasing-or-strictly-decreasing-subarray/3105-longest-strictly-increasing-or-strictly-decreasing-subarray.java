class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max =1;
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i;j<n-1;j++){
                if(nums[j]<nums[j+1]){
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    count++;
                    max=Math.max(count,max);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}