public class coinperm {
    public static void main(String[] args) {
        int arr[]={2,3,5};
        int s=8;
        coin(s, arr, "",0,0);
    }
    public static void coin(int s,int [] a,String sc,int sum,int idx){
        if(sum==s){
            System.out.println(sc);
            return;
        }
        if(sum>s){
            return;
        }
        for(int i=idx;i<a.length;i++){
            coin(s, a, sc+a[i], sum+a[i],i);

        }
    }
}
