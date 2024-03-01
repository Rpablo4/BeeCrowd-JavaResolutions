import java.util.Scanner;

public class Bee1002{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);

        String areaFormatada = String.format("%.4f", area);

        System.out.println("A=" + areaFormatada);
    }
}