import java.util.Scanner;
class ArrayGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Input: Size of array 'A'
            int N = scanner.nextInt();

            // Input: Array elements
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Output: Maximum possible score for this test case
            System.out.println(maximumScoreRecursive(A, 0, 0, N - 1));
        }
    }

    public static int maximumScoreRecursive(int[] A, int leftSum, int currentIndex, int endIndex) {
        // Base case: Check if the array is empty or the currentIndex is out of bounds
        if (currentIndex > endIndex) {
            return 0;
        }

        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }

        // Check if the current split is valid
        if (leftSum == totalSum - leftSum) {
            // Found a valid split, increase the score
            return 1 + maximumScoreRecursive(A, leftSum + A[currentIndex], currentIndex + 1, endIndex);
        } else {
            // Move to the next index without increasing the score
            return maximumScoreRecursive(A, leftSum + A[currentIndex], currentIndex + 1, endIndex);
        }
    }
}

// 3
// 3
// 3 3 3
// 4
// 2 2 2 2
// 7
// 4 1 0 1 1 0 1

    

