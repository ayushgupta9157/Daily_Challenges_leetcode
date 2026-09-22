class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=1;
        int j=0;
        while(i<n){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i-1];
                j++;
            }
            i++;
        }
        nums[j] = nums[n-1];
        j++;
        return j;
    }
}