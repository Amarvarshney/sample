import java.util.Scanner;

public class tcsq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int l=sc.nextInt();//number of animals
        // int m=sc.nextInt(); // number of legs
        // int x,y;
        // y=((m-2*l)/2);
        // x=l-y;
        // System.out.println(x +" "+ y);
        int n=sc.nextInt(); //number of rows n=3
        int c=sc.nextInt(); //number of column c=4
        //matrics=0100,1101,1111
        int arr[][]=new int[n][c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxcar=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>=maxcar){
                maxcar=count;
                ans=i+1;
            }
        }
        System.out.println(ans);

    }
}
