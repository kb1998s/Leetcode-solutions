import java.util.HashSet;


class Solution {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> blockSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) return false;
                if (board[j][i] != '.' && !colSet.add(board[j][i])) return false;
                int rowB = (3 * (i / 3)) + (j / 3);
                int colB = (3 * (i % 3)) + (j % 3);
                if (board[rowB][colB] != '.' && !blockSet.add(board[rowB][colB])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] test = new char[][] {{'5','3','.','.','7','.','.','.','.'}
        ,{'6','.','.','1','9','5','.','.','.'}
        ,{'.','9','8','.','.','.','.','6','.'}
        ,{'8','.','.','.','6','.','.','.','3'}
        ,{'4','.','.','8','.','3','.','.','1'}
        ,{'7','.','.','.','2','.','.','.','6'}
        ,{'.','6','.','.','.','.','2','8','.'}
        ,{'.','.','.','4','1','9','.','.','5'}
        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.print(isValidSudoku(test));
    }
}