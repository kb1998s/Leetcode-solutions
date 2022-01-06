import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<String>> result = new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        
//  Construct the table;
    char[][] table = new char[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            table[i][j] = '.';
        }
    }

    List<int[]> queens = new ArrayList<>();
    backtracking(table, 0, queens);

        
        
        return result;
    }
    
    public static void backtracking(char[][] table, int level, List<int[]> queens) {
        if (level >= table.length) {
            System.out.println("test");
        }
        if (queens.size() == table.length) {
            List<String> res = new ArrayList<>();
            for (int i = 0; i < table.length; i++) {
                res.add(new String(table[i]));
            }
            result.add(res);
        }

        // or try to add the queen
        for (int i = 0; i < table.length; i++) {
            if (addAble(level, i, queens)) {
                table[level][i] = 'Q';
                queens.add(new int[] {level,i});
                backtracking(table, level + 1, queens);
                table[level][i] = '.';
                queens.remove(queens.size() - 1);
            }
        }
    }

    public static Boolean addAble(int row, int col, List<int[]> queens) {
        
        for (int i = 0; i < queens.size(); i++) {
            int[] cmp = queens.get(i);
            if (cmp[0] == row || cmp[1] == col || cmp[0] + cmp[1] == row + col || cmp[0] - cmp[1] == row - col) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){
        System.out.println(solveNQueens(4).size());
        
    }
    
    
    
}

// class Solution {
//     public List<List<String>> result = new ArrayList<>();
//     public List<List<String>> solveNQueens(int n) {
        
// //  Construct the table;
//     char[][] table = new char[n][n];
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n; j++) {
//             table[i][j] = '.';
//         }
//     }

//     List<int[]> queens = new ArrayList<>();
//     backtracking(table, 0, queens);

        
        
//         return result;
//     }
    
//     public void backtracking(char[][] table, int level, List<int[]> queens) {
//         if (level >= table.length) return;
//         if (queens.size() == table.length) {
//             List<String> res = new ArrayList<>();
//             for (int i = 0; i < table.length; i++) {
//                 res.add(new String(table[i]));
//             }
//             result.add(res);
//         }

//         // or try to add the queen
//         for (int i = 0; i < table.length; i++) {
//             if (addAble(level, i, queens)) {
//                 table[level][i] = 'Q';
//                 queens.add(new int[] {level,i});
//                 backtracking(table, level + 1, queens);
//                 queens.remove(queens.size() - 1);
//             }
//         }
//     }

//     public Boolean addAble(int row, int col, List<int[]> queens) {
        
//         for (int i = 0; i < queens.size(); i++) {
//             int[] cmp = queens.get(i);
//             if (cmp[0] == row || cmp[1] == col || cmp[0] + cmp[1] == row + col || cmp[0] - cmp[1] == row - col) {
//                 return false;
//             }
//         }
//         return true;
//     }