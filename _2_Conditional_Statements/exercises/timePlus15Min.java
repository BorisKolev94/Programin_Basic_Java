package exercises;

import java.util.Scanner;

public class timePlus15Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMiN = hour * 60 + minutes + 15;
        hour = totalMiN / 60;
        minutes = totalMiN % 60;
        System.out.printf("%d:%02d", hour, minutes);
    }
}






