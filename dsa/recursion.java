
public class recursion {
    private static int Factioral(int num){
        if(num==0){
            return 1;
        }

        int r=num*Factioral(num-1);
        return r;
    }
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<=num;i++){
        System.out.println(Factioral( i)+" ");
        }
    }
}
