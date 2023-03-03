package forLoopExercise;

import java.util.Scanner;

public class halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            if (maxNumber < currentNumber) {
                maxNumber = currentNumber;
            }

        }
        sum = sum - maxNumber;
        int diff = Math.abs(sum - maxNumber);
        if (sum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);

        }
    }
}
