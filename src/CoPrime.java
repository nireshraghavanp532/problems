import java.util.Scanner;

public class CoPrime {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int countCoprimesUpTo(int[] arr, int index) {
        int count = 0;
        int n = arr[index];

        for (int i = 1; i <= n; i++) {
            if (gcd(i, n) == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int result = countCoprimesUpTo(inputArray, i);
            System.out.println("Number of coprime numbers up to " + inputArray[i] + ": " + result);
        }
    }
}