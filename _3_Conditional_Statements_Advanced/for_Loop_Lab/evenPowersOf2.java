package for_Loop_Lab;

import java.util.Scanner;

public class evenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i += 2) {
            double result = Math.pow(2, i);
            System.out.printf("%.2f\n",result);
        }
    }
}
