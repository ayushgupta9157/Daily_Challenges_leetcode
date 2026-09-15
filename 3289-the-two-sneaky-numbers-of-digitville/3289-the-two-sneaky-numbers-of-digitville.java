class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(list1.contains(nums[i])){
                list2.add(nums[i]);
            }
            else{
                list1.add(nums[i]);
            }
        }
        int[] arr = new int[2];
       for(int i = 0; i < list2.size(); i++) {
            arr[i] = list2.get(i);
        }
        return arr;
    }
}