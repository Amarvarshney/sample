//import java.util.*;

public class pattern12 {
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=2*n-1;i++){
            int space=n-i;
            int star=i;
            if(i>n){
                star=2*n-i;
                space=i-n;
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }   
}

