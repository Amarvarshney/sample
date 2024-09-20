import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String s="";
        for(int i=a.length()-1;i>=0;i--){
            s+=a.charAt(i);
            
        }
        System.out.println(s);

    }
    
}
