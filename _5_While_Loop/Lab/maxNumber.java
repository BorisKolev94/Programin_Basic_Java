package Lab;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int maxNumber=Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            if (maxNumber<currentNumber){
                maxNumber=currentNumber;
            }

            input= scanner.nextLine();
        }
        System.out.printf("%d", maxNumber);
    }
}
