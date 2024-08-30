public class merge {
	public static void main(String[] args) {
		int arr[]= {7,6,9,4,11,5,2};
		int ans[]=mergesort(arr,0,arr.length-1);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}
	public static int[] mergesort(int arr[],int si,int ei) {
		if(si==ei) {
			int a[]=new int[1];
			a[0]=arr[si];
			return a;
		}
		int mid=(si+ei)/2;
		int ans1[]=mergesort(arr,si,mid);
		int ans2[]=mergesort(arr,mid+1,ei);
		return mergeArrays(ans1,ans2);
	}
	  public static  int[] mergeArrays(int[] arr1, int[] arr2) {
	        int i = 0, j = 0, k = 0;
	        int n = arr2.length;
	        int m = arr1.length;
	        int arr3[] = new int[m + n];
	        while (i < m && j < n) {
	            if (arr1[i] < arr2[j])
	                arr3[k++] = arr1[i++];
	            else
	                arr3[k++] = arr2[j++];
	        }

	        while (i < m)
	            arr3[k++] = arr1[i++];

	        while (j < n)
	            arr3[k++] = arr2[j++];
	        
	        return arr3;
	    }

}

