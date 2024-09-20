// // Java Program to print
// // Butterfly Pattern
// import java.util.*;

// // Java code for printing pattern
// public class timepass {

// 	// Function to demonstrate pattern
// 	public static void printPattern(int n)
// 	{
// 		int i, j;
		
// 		// outer loop to handle upper part
		

// 		// outer loop to handle lower part
// 		for (i = n; i >= 1; i--) {
// 			// inner loop to print stars
// 			for (j = 1; j <= i; j++) {
// 				System.out.print("*");
// 			}

// 			// inner loop to print spaces
// 			int spaces = 2 * (n - i);
// 			for (j = 1; j <= spaces; j++) {
// 				System.out.print(" ");
// 			}

// 			// inner loop to print stars
// 			for (j = 1; j <= i; j++) {
// 				System.out.print("*");
// 			}

// 			System.out.println();
// 		}
//         for (i = 1; i <= n; i++) {
// 			// inner loop to print stars
// 			for (j = 1; j <= i; j++) {
// 				System.out.print("*");
// 			}

// 			// inner loop to print spaces
// 			int spaces = 2 * (n - i);
// 			for (j = 1; j <= spaces; j++) {
// 				System.out.print(" ");
// 			}

// 			// inner loop to print stars
// 			for (j = 1; j <= i; j++) {
// 				System.out.print("*");
               
// 			}

// 			System.out.println();
// 		}
// 	}

// 	// Driver Function
// 	public static void main(String args[])
// 	{
// 		int n = 7;
// 		printPattern(n);
// 	}
// }
import java.util.*;
public class timepass{
    public static void main (String args[]) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int nst=n-1;
		int nsp=1;
		int row=n*2-1;
		for(int i=1;i<=row;i++){
			if(i==1||i==row){
				for(int cst=1;cst<=row;cst++){
					System.out.print("*");
				}
			}
			else{
				for(int cst=1;cst<=nst;cst++){
					System.out.print("*");
				}
				for(int csp=1;csp<=nsp;csp++){
					System.out.print(" ");
				}
				for(int cst=1;cst<=nst;cst++){
					System.out.print("*");
				}
				if(i<=row/2){
					nsp=nsp+2;
					nst--;
				}else{
					nsp=nsp-2;
					nst++;
				}
			}System.out.println();
		}
		sc.close();
	}
}
//Question 10