class Solution {
    public boolean isPowerOfTwo(int n) {
        int a=31;
        for(int i=0;i<a;i++){
            if(1<<i==n){
                return true;
            }
        }
        return false;
    }
}