package Exercise;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int fullCake = width * length;
        boolean cakeIsOver = false;


        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            fullCake = fullCake - pieces;
            if (fullCake <= 0) {
                cakeIsOver = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (cakeIsOver) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(fullCake));
        }else {
            System.out.printf("%d pieces are left.", fullCake);
        }
    }
}
