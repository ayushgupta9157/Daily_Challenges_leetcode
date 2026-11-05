class Solution {
    public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int[] left = new int[n];  
            int[] right = new int[n];  
            Stack<Integer> s = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    right[i] = n;
                } else {
                    right[i] = s.peek();
                }
                s.push(i);
            }
            s.clear();
            for (int i = 0; i < n; i++) {
                while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    left[i] = -1;
                } else {
                    left[i] = s.peek();
                }

                s.push(i);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int width = right[i] - left[i] - 1;
                ans = Math.max(ans, width * heights[i]);
            }
            return ans;
        }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] mat = new int[m][n];
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == '1') {
                mat[0][j] = 1;
            }
            else{
                mat[0][j] = 0;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    mat[i][j] = 1 + mat[i - 1][j];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int[] row:mat){
            int a = largestRectangleArea(row);
            max=Math.max(max,a);
        }
        return max;
    }
}