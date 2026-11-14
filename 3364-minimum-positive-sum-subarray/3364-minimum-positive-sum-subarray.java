class Solution {
    public int minimumSumSubarray(List<Integer> list, int l, int r) {
        int min = Integer.MAX_VALUE;
        int n = list.size();
        for (int size = l; size <= r; size++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += list.get(i);
            }
            if (sum > 0) {
                min = Math.min(min, sum);
            }
            for (int i = size; i < n; i++) {
                sum += list.get(i);
                sum -= list.get(i - size);
                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}