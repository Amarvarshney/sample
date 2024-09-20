public class besetted {
    public static void main(String[] args) {
        int n=2;
        int s=4;
        String a="ab";
        boolean [] b={false,false,false,false};
        String ans="";
        besett(n, s, b,0,ans);

    }
    private static void besett(int n,int s,boolean [] b,int c,String an){
        if(c==n){
            System.out.println(an);
            return;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]==false){
                b[i]=true;
                besett(n, s, b, c+1, an+"s"+(i+1)+"-"+"p"+(c+1)+" ");
                b[i]=false;//back tracking
            }
            
        }
    }
    
}
