public class tworecursion {
    public static void main(String[] args) {
        int n=5;
        func1(n);
    }
    public static void func1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func1(n-1);
        System.out.println(n);
    }
    
}
