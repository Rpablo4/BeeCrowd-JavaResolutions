import java.util.Scanner;

public class Bee1030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NC = scanner.nextInt();
        for (int i = 1; i <= NC; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println("Case " + i + ": " + josephus(n, k));
        }
        scanner.close();
    }

    private static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
}
