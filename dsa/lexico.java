public class lexico {
    public static void main(String[] args) {
        lexco(0,10);
    }
    public static void lexco(int s,int n){
        if(s>n){
            return;
        }
        int i=0;
        System.out.print(s+" ");
        if(s==0){
            i=1;
        }
        for(;i<=9;i++){
            lexco(s*10+i,n);
            
        }
    }
    
    
}
