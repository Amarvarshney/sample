public class permutation {
    public static void main(String[] args) {
        String a="abca";
        String s="";
        permut(a,s);
    }
    public static void permut(String a,String s){
        if(a.length()==0){
            System.out.println(s);
            return;
        }
        for(int i=0;i<a.length();i++){
            boolean amar=true;
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    amar=false;
                    break;
                }   
            }
            if(amar==true){
                permut(a.substring(0, i)+a.substring(i+1), s+a.charAt(i));  
            }
        }
        
    }
    
}
