import java.util.HashSet;

public class LC36 {
    public boolean isValidSoduku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> rows = new HashSet<>();
            HashSet<Character> cols = new HashSet<>();
            HashSet<Character> cubes = new HashSet<>();
            int indexRow = (i / 3) * 3;
            int indexCol = (i % 3) * 3;
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j]))
                    return false;
                if (board[j][i] != '.' && !cols.add(board[j][i]))
                    return false;

                if (board[indexRow + j/3][indexCol + j%3] != '.' && !cubes.add(board[indexRow + j/3][indexCol + j%3]))
                    return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] soduku = {{'.','8','7','6','5','4','3','2','1'},{'2','.','.','.','.','.','.','.','.'},{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},{'9','.','.','.','.','.','.','.','.'}};
        LC36 Solution = new LC36();
        System.out.println(Solution.isValidSoduku(soduku));
    }
}
