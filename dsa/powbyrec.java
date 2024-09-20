import java.util.*;
class bain {
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        double x=sc.nextInt();
        int n=sc.nextInt();
        if(n<0){
            System.out.print(myPow(x,n));
        }
        else{
            System.out.print(powe(x,n));
        }
    }
    public  static double myPow(double x, int n) {
        if(n<0) return 1/powe(x,-1*n);
        return powe(x,n);
    }
    public static double powe(double x,int n){
        if(n==0){
            return 1;
        }
        double a=powe(x,n/2);
        if(n%2==0){
            return a*a;
        }else{
            return x*a*a;
        }
    }
}