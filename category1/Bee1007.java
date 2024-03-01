import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenceOfProduct = (a * b - c * d);

        System.out.printf("DIFERENCA = %d\n",diferenceOfProduct);
    }
}
