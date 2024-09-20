public class cointoss {
    //static int co=0;
    public static void main(String[] args) {
        int n=3;
        String ans="";
        coinfunc(n,ans);
        //System.out.println(coinfunc(n, ans));
        //System.out.println(co);
    }
    // static void coinfunc(int n,String ans){
    //     //base condition
    //     if(n==0){
    //         co++;
    //         System.out.println(ans);
    //         return;
    //     }
    //     char c='H',t='T';
    //     //recursion call
    //     coinfunc(n-1,ans+c);
    //     coinfunc(n-1, ans+t);
    // }
    static void coinfunc(int n,String ans){
        //base condition
        //first method
        // if(n==0){
        //     if(ans.charAt(0)=='H' && ans.charAt(1)=='H'||ans.charAt(1)=='H' &&ans.charAt(2)=='H'){
        //         return 0; 
        //     }else{
        //         System.out.println(ans);
        //         return 1;
        //     }
        // }
        
        // recursion call
        // int x= coinfunc(n-1,ans+'H');
        // int y=coinfunc(n-1, ans+'T');
        // return x+y;
        //second method
        if(n==0){
            System.out.println(ans);
            return ;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            coinfunc(n-1,ans+'H');
        }
        coinfunc(n-1, ans+'T');
    }
    
    
}
