class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int i = 0 ; 
        while(i<n){
            int m = nums[i];
            int sum = 0;
            while(m>0){
                sum = sum + m % 10;
                m = m / 10;
            }
            if(sum == i) return i ;
            i++;
        }
        return -1;
    }
}