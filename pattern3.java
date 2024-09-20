public class pattern3 {
    public static void main(String[] args){
        /* *****
             ****
               ***
                 **
                   * 
         */
        int n=5;
        int r=1;
        while(r<=n){
            int space=1;
            while(space<=4*r-4){
                System.out.print(" ");
                space++;
            }
            int star=1;
            while(star<=n-r+1){
                System.out.print("* ");
                star++;
            }
            r++;
            System.out.println();
        }

        
    }
    
}
