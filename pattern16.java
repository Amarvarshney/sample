public class pattern16 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==5){
                     System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
            for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==5||i==2&&j==2||i==2&&j==4||i==3&&j==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(j==1||j==n){
                         System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    if(j==1||i-j==0){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    
                    } 
                
                System.out.println();
            }
            
    }
}
