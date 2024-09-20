public class pattern8 {
    public static void main(String[] args) {
    //   *
    //     * *
    //       * * *
    //         * * * *
    //           * * * * *
       int n=5;
       int r=1;
       while(r<=n){
        int sp=1;
        while(sp<=2*r-2){
            System.out.print(" ");
            sp++;
        }
        int star=1;
        while(star<=r){
            System.out.print(star);
            star++;
        }
        r++;
        System.out.println();
       }
    }
}
