class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int m = a.length ;
        int n = a[0].length;
        int start = 0;
        int end = m*n-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int midEle = a[mid/n][mid%n];
            if(midEle == target) return true;
            else if(midEle<target) start = mid +1;
            else end = mid - 1;
        }
        return false;
    }
}