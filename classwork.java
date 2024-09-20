public class classwork {
    int x=100;
    static int y=200;
    int m1(int x)
    {
        System.out.println("hello int-parameter");
        return x;
    }
    static void m1(){
       // x,y,m1(in t x)
       classwork a=new classwork();
       System.out.println(a.x);
       System.out.println(classwork.y);
       a.m1(a.x);
       
       System.out.println("hello no-parameter");
    }
    void m3(){
        //  x,y,m1(int x)
        classwork d=new classwork();
        System.out.println(x);
        System.out.println(classwork.y);
        m1(d.x);


    }
    public static void main(String[] args) {
       // x,y,m1(intx),m1(),m3()
       classwork e=new classwork();
       System.out.println(e.x);
       System.out.println(classwork.y);
       e.m1(45);
       m1();
       e.m3();


    }
    
}
