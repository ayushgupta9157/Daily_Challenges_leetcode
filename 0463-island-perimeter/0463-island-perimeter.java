class Solution {
    static int peri;
    public void dfs(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            peri++;
            return;
        }
        if (grid[i][j] == -1) {
            return;
        }
        grid[i][j] = -1;
        dfs(grid, i + 1, j, m, n);
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i, j + 1, m, n);
        dfs(grid, i, j - 1, m, n);
    }

    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        peri = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j, m, n);
                    return peri;
                }
            }
        }
        return 0;
    }
}