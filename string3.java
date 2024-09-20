public class string3 {
    public static void main(String[] args) {
        // String s="avbdecehggul";
        // char[] ch=s.toCharArray();
        // char temp;
        int [] arr={1,78,9,5,67,7};
        int size= arr.length;
        int temp=0;
        for(int i=0;i<size-1 ;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
        System.out.println(arr.toString(arr));
        

    }
}
   

