public class bubble_shorts {
    public static void bubblearray(int arrays[]){
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arrays[]={1,4,5,3,8,6,90,2,0};
        for(int i=0;i<arrays.length-1;i++){
            for(int j=0;j<arrays.length-1-i;j++){
                if(arrays[j]>arrays[j+1]){
                    int temp=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=temp;
                }
            }
        }
        bubblearray(arrays);

    }
    
}
