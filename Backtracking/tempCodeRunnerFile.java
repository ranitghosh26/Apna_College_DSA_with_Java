
        // right diagonal
        for(int i=row-1,j=cal+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;