public class recursion2 {
    //lastoccurance
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        int t=10;
        System.out.println(find(arr,arr.length-1,t));
    }
    private static int find(int []arr,int idx,int t){
            if(idx==-1){
                return -1;
            }
            if(arr[idx]==t){
                return idx;
            }
        
        return find(arr,idx-1,t);
    }
}
