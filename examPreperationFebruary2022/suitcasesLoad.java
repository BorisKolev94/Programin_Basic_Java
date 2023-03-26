import java.util.Scanner;

public class suitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacityBagazhnik = Double.parseDouble(scanner.nextLine());
        double copyCapcityBagazhnik = capacityBagazhnik;
        int count = 0;
        boolean isFull = false;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            double volume = Double.parseDouble(command);
            count++;
            if (count % 3 == 0) {
                volume = volume * 1.10;
            }
            copyCapcityBagazhnik = copyCapcityBagazhnik - volume;
            if (capacityBagazhnik <= 0) {
                isFull = true;
                count--;
                break;
            }
            command = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
            System.out.printf("Statistic: %d suitcases loaded.%n", count);

        }
    }

