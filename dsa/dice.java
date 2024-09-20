public class dice {
    public static void main(String[] args) {
        int n=0;
        String x="";
        System.out.println(dicecount(n,x));
    }
    static int dicecount(int n,String a){
        int c=0;
        if(n==3){
            System.out.print(a+" ");
            c++;
            return 1;
        }
        if(n>3){
            return 0;
        }
        for(int i=1;i<=3;i++){
        c=dicecount(n+i, a+i);
        }
        return c;
    }
    
}
