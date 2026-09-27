class Solution {
    public int arrangeCoins(int n) {
        long m = n;
        return (int)(Math.sqrt(8*m+1)-1)/2;
    }
}