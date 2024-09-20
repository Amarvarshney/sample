import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
    //      *
    //     * *
    //    *   *
    //   *     * 
    //    *   * 
    //     * * 
    //      * 
        Scanner sc=new Scanner(System.in);
        
        int n= sc.nextInt();
        for(int i=1;i<=(n+1)/2;i++){
            for(int j=1;j<=(n+1)/2-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=(n+1)/2-1;i>=1;i--){
            for(int j=1;j<=(n+1)/2-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
