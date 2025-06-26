public class sudokuSolver {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        
     // check in column
        for (int i = 0; i < 9; i++) {
            if(sudoku[i][col] == digit){
                return false;
            }
        }

         // check in row
        for (int i = 0; i < 9; i++) {
            if(sudoku[row][i] == digit){
                return false;
            }
        }



        // check in subgrid
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for (int i = startRow; i < startRow+3; i++) {
            for (int j = startCol; j < startCol+3; j++) {
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }



    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // Base case
        if(row ==9 && col == 0){
            return true;
        }else if(row == 9){
            return false;
        }

        // recursion 
        int nextRow = row,nextCol =col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        
        for (int digit =1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0; // backtrack
            }
        }
        return false;
    }
    

    // Print the sudoku board
    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        int sudoku[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0 ,6},
            {0 ,6 ,0 ,0 ,0 ,2 ,8 ,0 ,0},
            {0 ,0 ,4 ,1 ,9 ,5 ,0 ,0 ,8},
            {0 ,8 ,7 ,0 ,6 ,1 ,2 ,4 ,9}
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Sudoku solved successfully");
        }else{
            System.out.println("No solution exists");
        }
        
    }
    
}
