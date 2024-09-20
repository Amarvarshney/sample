public class string1 {
    public static void main(String[] args){
        // String s1= new String("amar");
        // String s2=s1.concat("varshney");
        // System.out.println(s2 + s1);
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==5 || j==5 || j==1 || i==1){
                    System.out.print("* ");
                    if(j>4 && i<5){
                        System.out.print(" ");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
