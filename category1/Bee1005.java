import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double weightA = 3.5;
        double weightB = 7.5;
        double average = (a * weightA + b * weightB) / (weightA + weightB);

        System.out.printf("MEDIA = %.5f\n", average);
    }
}
