import java.util.Scanner;

public class Bee1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.println(Long.toUnsignedString(mofizAddition(a, b)));
        }
        scanner.close();
    }

    private static long mofizAddition(long a, long b) {
        return a ^ b;
    }
}
