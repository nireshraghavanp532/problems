import java.util.Arrays;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int z = 0;

        for (int i = 0; i < x; i++) {
            if (arr[i] >= n) {
                z = i;
                break;
            }
        }

        if ("UP".equals(s1) || "DN".equals(s1)) {
            if ("UP".equals(s1)) {
                for (int i = z; i < x; i++) {
                    System.out.println(arr[i]);
                }
            }
            else {
                for (int i = z ; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}