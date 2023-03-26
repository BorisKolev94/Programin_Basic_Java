import java.util.Scanner;

public class _06_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upper1 = scanner.nextInt();
        int upper2 = scanner.nextInt();
        int upper3 = scanner.nextInt();
        boolean isPrime = false;

        for (int i = 2; i <= upper2; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                for (int j = 0; j <= upper1; j += 2) {
                    for (int k = 0; k <= upper3; k += 2) {
                        int pin = j * 100 + i * 10 + k;
                        if (isPrime(i) && pin >= 200 && pin <= 799) {
                            System.out.printf("%d %d %d%n", j, i, k);
                        }
                    }
                }