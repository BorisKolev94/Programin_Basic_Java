import java.util.Scanner;

public class _04_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double kilometersFirtsDay = Double.parseDouble(scanner.nextLine());

        double total = 0;
        double total2=0;
        double procenti = 0;
        for (int i = 1; i <= days; i++) {
            procenti = Double.parseDouble(scanner.nextLine());
            total=kilometersFirtsDay +((procenti/100)*kilometersFirtsDay);
            total2= total +((procenti/100)*total);
        }

        System.out.println(total2);

    }
}
