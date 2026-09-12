class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int j=0;
        for(int i=n;i<2*n;i++){
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}