public class longestarrat {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int arr1[];
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
        

    }
}
