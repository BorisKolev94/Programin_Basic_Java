package exercises;

import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;

        switch (operator) {
            case ("+"):
                result = N1 + N2;
                if (result%2==0) {
                    System.out.printf("%.2f - even", result);
                }else{
                    System.out.printf("%.2f - odd", result);
                }
                break;
            case ("-"):
                result=N1-N2;
                if (result%2==0){
                    System.out.printf("%.2f - even", result);
                }else
                    System.out.printf("%.2f - odd", result);
                break;
            case ("*"):
                result =N1 *N2;
                if (result%2==0){
                    System.out.printf("%.2f - even", result);
                }else
                    System.out.printf("%.2f - odd", result);
                break;
            case("/"):
                result=N1*1.0/N2;
                System.out.printf("%.2f", result);
            case("%"):
                result=N1%N2;
                System.out.println(result);

        }

    }
}
