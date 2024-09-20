public class dulicate {
    public static void main(String[] args) {
        String s="avjsadaf";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=s.indexOf(ch, i+1);
            if(idx==-1){
                sb=sb.append(ch);
            }

        }
        System.out.println(sb);
} 
}
  

