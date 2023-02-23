package exercises;

import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradus = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (gradus >= 10 && gradus <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                } else if (gradus > 18 && gradus <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                } else if (gradus >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                }
                break;
            case "Afternoon":
                if (gradus >= 10 && gradus <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                } else if (gradus > 18 && gradus <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                } else if (gradus >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                }
                break;
            case "Evening":
                if (gradus >= 10 && gradus <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                } else if (gradus > 18 && gradus <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                } else if (gradus >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    System.out.printf("It's %d degrees, get your %s and %s.", gradus, outfit, shoes);
                    break;
                }

        }
    }
}
