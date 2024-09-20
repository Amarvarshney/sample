public class skudo {
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board,0,0);
    }
    public static void solveSudoku(char[][] board,int row,int col) {
        if(col>=9){
            row++;
            col=0;
        }
        if(row>=9){
            print(board);
            return;
        }
        if(board[row][col]!='.'){
            solveSudoku(board, row, col+1);
        }
        if(board[row][col]=='.'){
            for(int i=0;i<9;i++){
                if(safe(board,row,col,i)==true){
                    board[row][col]=(char)(i+'0');
                    solveSudoku(board, row, col+1);
                    board[row][col]='.';
                }
            }
        }
    }
    public static boolean safe(char[][] board,int row,int col,int i){
        var ch=(char)(i+'0');
        //row
        for(int j=0;j<9;j++){
            if(board[row][col]==ch){
                return false;
            }
        }
        //left
        for(int a=0;a<9;a++){
            if(board[a][col]==ch){
                return false;
            }
        }
        //3*3 box check
        int mainrow=row-row%3;
        int maincol=col-col%3;
        for(int a=mainrow;a<mainrow+3;a++){
            for(int b=maincol;b<maincol+3;b++){
                if(board[a][b]==ch){
                    return false;
                }
            }
        }
        return true;
    }
    public static void print(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
