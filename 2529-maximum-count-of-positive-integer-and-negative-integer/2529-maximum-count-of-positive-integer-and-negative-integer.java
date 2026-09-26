class Solution {
    public int maximumCount(int[] nums) {
        int left = 0, right = nums.length - 1, n = nums.length;
        int count1 =0 , count2=0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < 0) {
                count1=mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        left = 0; right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                count2 = n-mid;
                right = mid - 1;
            }
        }
        return Math.max(count1,count2);
    }
}