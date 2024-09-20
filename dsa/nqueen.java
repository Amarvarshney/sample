import java.util.Scanner;

public class nqueen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean board[][]=new boolean[n][n];
        n_queen(board,n,0," ");
    }
    static void n_queen(boolean board[][],int n,int row,String s){
        //base case
        if(n==0){
            print(s);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(safe(board,row,i)){
                board[row][i]=true;
                n_queen(board, n-1, row+1,s+"{"+(row+1)+"-"+(i+1)+"}");
                board[row][i]=false;
            }
        }
    }
    // static void print(boolean board [][]){
    //     for(int i=0;i<board.length;i++){
    //         for(int j=0;j<board.length;j++){
    //             System.out.print(board[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("|N");
    // }
    static boolean safe(boolean board[][],int row,int col){
        //left diagonal
        int r=row;
        int c=col;
            while(r>=0 && c>=0){
                if(board[r][c]==true){
                    return false;
                }
                r--;
                c--;
            }
            //right diagonal
            r=row;
            c=col;
            while(r>=0 && c<board[0].length){
                if(board[r][c]==true){
                    return false;
                }
                r--;
                c++;
            }
            //top
            r=row;
            while(r>=0){
                if(board[r][col]==true){
                    return false;
                }
                r--;
            }
            return true;
    }
    public static void print(String s){
        System.out.print(s+" ");
    }
    
}
