package secondLecture;

import java.util.Scanner;

public class repaiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon = Integer.parseInt(scanner.nextLine());
        int boq = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int chasove = Integer.parseInt(scanner.nextLine());

        double cenaNailon = (nailon +2) * 1.50;
        double cenaBoq = (boq + boq * 0.10) * 14.50;
        double cenaRazreditel = razreditel * 5;

        double result = cenaNailon + cenaBoq +cenaRazreditel +0.40;
        double cenaMaistori = (result * 0.30) * chasove;
        double finalPrice = result + cenaMaistori;
        System.out.println(finalPrice);
    }
}
