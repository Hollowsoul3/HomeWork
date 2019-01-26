import java.util.Scanner;

public class wqe {
    public static void main(String[] args) {
        int[] A = input();
        if (arrConsecutive(A) == false) {
            System.out.println("no");
        } else
            System.out.println("yes");

    }

    public static int[] input() {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                int b = sc.nextInt();
                arr[i] = b;
            }
            return arr;
        }
    }

    public static boolean arrConsecutive(int[] arr) {
        for (int i = 1; arr.length - 1 > i; i++) {
            if (arr[i + 1] - arr[i] == 1 || arr[i + 1] - arr[i] == -1) {
                return true;
            }
        }
        return false;
    }
}