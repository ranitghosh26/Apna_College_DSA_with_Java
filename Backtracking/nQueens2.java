public class nQueens2 {

    public static boolean isSafe(char board[][], int row, int cal) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][cal] == 'Q') {
                return false;
            }
        }
        // left diagonal
        for (int i = row - 1, j = cal - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal
        for (int i = row - 1, j = cal + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) { // Check if it's safe to place a queen
                board[row][j] = 'Q'; // Place queen
                nQueens(board, row + 1); // Recursive call to place queen in next row
                board[row][j] = 'x'; // Backtrack
            }
        }
    }


    public static void printBoard(char board[][]) {
        System.out.println("________Chess Board__________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5; // Change the value of n to your desired board size
        char board[][] = new char[n][n];
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0); // Start from the first row
        System.out.println("Total solutions for  queens: " + count);
    
    }

}

