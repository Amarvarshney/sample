import java.util.*;

public class Functions1 {
    public static float circlecurfrance(float r) {
        return 2 * 3.14f * r;
    }
    public static void table3(int n){
        for(int i=1; i<=10;i++){
            System.out.println(n+"*"+ i+"="+n*i) ;   
        }
    }
    public static void main(String[] args) {
        System.out.print("enter the radius");
        Scanner c = new Scanner(System.in);
       // float r = c.nextFloat();
      //  double d = circlecurfrance(r);
        int n=c.nextInt();


        table3(n);
        c.close();
    }

}
