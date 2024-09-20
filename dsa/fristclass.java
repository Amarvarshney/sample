public class fristclass {
    public static void main(String[] args) {
        person per1=new person("amar",827982020,false);
        per1.print();
    }
}
class person{
    String name;
    int phone;
    boolean d;
    person(String n,int p,boolean d){
        name=n;
        phone=p;
        this.d=d;
    }
    public void print(){
        System.out.println(name);
        System.out.println(phone );
        System.out.println(d);
    }
}
