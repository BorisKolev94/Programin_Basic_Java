package Lab;

import java.util.Scanner;

public class personalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();


        if ("m".equals(gender) && age >= 16) {
            System.out.println("Mr.");
        } else if ("m".equals(gender) && age < 16) {
            System.out.println("Master");
        } else if ("f".equals(gender) && age >= 16) {
            System.out.println("Ms.");
        } else  {
            System.out.println("Miss");

        }


    }
}
