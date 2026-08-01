class Solution {

    public void solveSudoku(char[][] board) {
        sudokuSolver(board, 0, 0);
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit) {

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokuSolver(char[][] board, int row, int col) {

        // Base case
        if (row == 9) {
            return true;
        }

        // Find next cell
        int nextRow = row;
        int nextCol = col + 1;

        // If current row ends
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If cell is already filled
        if (board[row][col] != '.') {
            return sudokuSolver(board, nextRow, nextCol);
        }

        // Try digits '1' to '9'
        for (char digit = '1'; digit <= '9'; digit++) {

            if (isSafe(board, row, col, digit)) {

                // Choose
                board[row][col] = digit;

                // Explore
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }
}