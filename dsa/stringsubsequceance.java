public class stringsubsequceance {
    public static void main(String[] args) {
        String sc="abcd";
        String ans="";
        System.out.println("\n"+sub(sc,ans));
    }
    static int sub(String sc,String ans){
        //base case
        if(sc.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char ch=sc.charAt(0);
        //recursive call
        int x=sub(sc.substring(1), ans+ch);
        int y=sub(sc.substring(1), ans);
        return x+y;

    }
    
}

