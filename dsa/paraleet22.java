public class paraleet22 {
    public static void main(String[] args) {
        int n=2;
        int o=0,c=0;
        String s="";
        par(o,c,s,n);
    }
    static void par(int o,int c,String s,int n){
        if(o==n && c==n){
            System.out.println(s);
            return;
        }
        if (c<o) {
            par(o, c+1, s+")",n);    
        }
        if(o<n){
            par(o+1, c, s+"(",n);
        }
        
    }
        

}
