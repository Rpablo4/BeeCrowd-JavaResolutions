import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        double weightA = 2.0;
        double weightB = 3.0;
        double weightC = 5.0;
        double average = (a*weightA + b*weightB + c*weightC) / (weightA + weightB + weightC);

        System.out.printf("MEDIA = %.1f\n", average);
    }
}
