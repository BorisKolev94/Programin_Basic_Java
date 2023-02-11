package secondLecture;

import java.util.Scanner;

public class zadaljitelnaLiteratura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int resul1 = numberOfPages / pagesPerHour;
        int result2 = resul1 / numberOfDays;
        System.out.println(result2);
    }
}
