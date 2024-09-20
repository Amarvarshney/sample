import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean board[][]=new boolean[n][n];
        nqueen(board,n,0," ");
    }
    public static void nqueen(boolean [][] board,int n,int row,String s){
        if(n==0){
            print(s);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(safe(board,row,i)){
                board[row][i]=true;
                //nqueen(board,n-1,row+1,s+"{"+(row+1)+"-"+(i+1)+"}"+" ");
                nqueen(board, n-1, row+1,s+"{"+(row+1)+"-"+(i+1)+"}");
                board[row][i]=false;
            }
        }
    }
    public static void print(String s){
        System.out.print(s+" ");
    }
    public static boolean safe(boolean [][] board,int row,int col){
        //left
        int r=row; 
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]=true){
                return false;
            }
            r--;
            c--;
        }
        //rigth
        r=row;c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]=true){
                return false;
            }
            r--;
            c++;
        }
        //middle
        r=row;
        while(r>=0){
            if(board[r][col]=true){
                return false;
            }
            r--;
        }
        return true;
    }
   
}

