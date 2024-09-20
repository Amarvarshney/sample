public class backtracking {
    public static void main(String[] args) {
        int s=4;
        int n=2;
        boolean [] a=new boolean[s];
        System.out.println("\n"+count(n,a,0,"",0));

        
    }
    public static int count(int n, boolean a[],int c,String an,int idx){
        if(c==n){
            System.out.println(an);
            return 1;
        }
        int l=0;
        for(int i=idx;i<a.length;i++){
            if(a[i]==false){
                a[i]=true;
                l+= count(n, a,c+1,an+"s"+(i),i+1);
                a[i]=false;

            }
        }
        return l;
        
    }
}
