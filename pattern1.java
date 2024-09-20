public class pattern1 {
/* 
**
* * * 
* * * * 
* * * * */

    public static void main(String[] args) {
        int n=5;
        int cstar=1;
        int row=1;
        while(row<=n){
            int star=1;
            while(star<=cstar){
            System.out.print("* ");
            star=star+1;
        }
        row=row+1;
        cstar=cstar+1;
        System.out.println();
    
    }
    
}
}
