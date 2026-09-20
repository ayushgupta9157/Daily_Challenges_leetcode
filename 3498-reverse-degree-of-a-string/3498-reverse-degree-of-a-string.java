class Solution {
    public int reverseDegree(String s) {
        int n = s.length();

        int total = 0;
        for(int i = 0;i<n;i++){
            total += ( (26 - (s.charAt(i) - 97)) * (i + 1));
        }
        return total;
    }
}