package Lab;

import java.util.Scanner;

public class sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        System.out.println(number);
        while (n >= number) {
            number = number * 2 + 1;
            if (number <= n) {
                System.out.println(number);
            } else {
                break;
            }
        }
    }
}

