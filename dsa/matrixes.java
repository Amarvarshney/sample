public class matrixes {
    public static void main(String[] args) {
        //int a=2,b=2;
        String ans="";
        System.out.println(matfun(0,0,2,2,ans));
    }
    public static int matfun(int x,int y, int a, int b,String ans){
        if(x==a && y==b){
            System.out.println(ans);
            return 1;
        }
        if(x>a || y>b){
            return 0;
        }
        //second method
        // if(x<=a){
        //     matfun(x+1,y,a,b,ans+'H');
        // }
        // if(y<=b){
        //      matfun(x,y+1,a,b,ans+'H');
        // }
        int n= matfun(x+1,y,a,b,ans+'H');
        int k = matfun(x,y+1,a,b,ans+'V');
        return n+k;
    }
    
}
