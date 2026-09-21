class Solution {
    public void gameOfLife(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        
        int[][] copy = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = board[i][j];
            }
        }

     
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                int aliveNeighbors = 0;

            
                for (int k = 0; k < 8; k++) {

                    int nr = r + dr[k];
                    int nc = c + dc[k];

                   
                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols) {

                        if (copy[nr][nc] == 1) {
                            aliveNeighbors++;
                        }
                    }
                }

                if (copy[r][c] == 1) {

                    if (aliveNeighbors < 2 || aliveNeighbors > 3) {
                        board[r][c] = 0;
                    }

                } else {

                    if (aliveNeighbors == 3) {
                        board[r][c] = 1;
                    }
                }
            }
        }
    }
}