public class merage {
    private static boolean so(int [] arr,int i){
        //base case
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        //recursion call
        boolean is_sort=so(arr,i+1);
        //calcuation
        if(is_sort){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,90};
        System.out.println(so(arr,0));
    }
    }
    

