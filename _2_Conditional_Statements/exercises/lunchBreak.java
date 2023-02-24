package exercises;

import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        int epizodVreme =Integer.parseInt(scanner.nextLine());
        int po4ivka = Integer.parseInt(scanner.nextLine());
        double vremeObqd = po4ivka/8.0;
        double vremeOtdih = po4ivka/4.0;
        double ostanaloVreme =  po4ivka-vremeObqd-vremeOtdih;
        double diff = Math.abs(ostanaloVreme-epizodVreme);

        if (ostanaloVreme>=epizodVreme){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name,Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(diff));
        }

    }
}
