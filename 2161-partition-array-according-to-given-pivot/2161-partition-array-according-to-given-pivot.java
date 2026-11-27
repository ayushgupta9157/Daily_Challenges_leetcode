class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        
        for (int num : nums) {
            if (num < pivot) {
                l1.add(num);
            } else if (num == pivot) {
                l2.add(num);
            } else {
                l3.add(num);
            }
        }
        
        int i = 0;
        for (int num : l1) nums[i++] = num;
        for (int num : l2) nums[i++] = num;
        for (int num : l3) nums[i++] = num;
        
        return nums;
    }
}