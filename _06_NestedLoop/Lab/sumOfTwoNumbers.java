package Lab;

import java.util.Scanner;

public class sumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firtsNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int x1 = 0;
        int x2 = 0;
        boolean isFound = false;

        for (int i = firtsNumber; i <= secondNumber; i++) {
            for (int j = firtsNumber; j <= secondNumber; j++) {
                counter++;
                if (i + j == magicNumber) {
                    x1 = i;
                    x2 = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, x1, x2, magicNumber);
        }else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}