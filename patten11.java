public class patten11 {
    public static void main(String[] args) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // int n=5;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for(int c=1;c<=n;c++){
        // for(int k=1;k<=n-c;k++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // }

        int n = 5;
        for (int i = 1; i <= 2*n-1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

}
