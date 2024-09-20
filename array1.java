import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] marks=new int[size];
        for(int i=0; i<size;i++){
            marks[i]=sc.nextInt();
        }
        //output
        for(int i=0; i<size;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
    
}
