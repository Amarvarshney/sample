public class towerof {
    public static void main(String[] args) {
        int n=3;
        tower(n,"A","b","c");

    }
    public static void tower(int n,String a,String b,String c){
        if(n==0){
            return;
        }
        tower(n-1,a,c,b);
        System.out.println("move"+n+"the disc"+a+"to"+b);
        tower(n-1,c,b,a);
    }
    
}
