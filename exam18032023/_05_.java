import java.util.Scanner;

public class _05_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countYes = 0;
        int countNo = 0;
        int allMeters = 5364;
        boolean meterIsmoreThan8848 = false;
        boolean dayAreMoreThan5 = false;
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String text = scanner.nextLine();
            int meters = Integer.parseInt(scanner.nextLine());
            allMeters = allMeters + meters;
            if (text.equals("Yes")) {
                countYes++;
            } if (countYes > 5) {
                dayAreMoreThan5=true;
                break;
            }
            if (allMeters >= 8848) {
                meterIsmoreThan8848 = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (dayAreMoreThan5) {
            System.out.println("Failed!%n");
            System.out.printf("%d", 8848-allMeters);
        }else if (meterIsmoreThan8848){
            System.out.printf("Goal reached for %d days!", countYes);
        }

    }
}
