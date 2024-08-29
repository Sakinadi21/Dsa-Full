package NumsIsland;

public class Island {

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];  // Corrected the typo
        int numOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, i, j, visited);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        // Check boundaries and whether the cell is water ('0') or already visited
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;  // Mark the current cell as visited

        // Explore all 4 possible directions: up, down, left, right
        dfs(grid, i - 1, j, visited);  // up
        dfs(grid, i + 1, j, visited);  // down
        dfs(grid, i, j - 1, visited);  // left
        dfs(grid, i, j + 1, visited);  // right
    }
}

