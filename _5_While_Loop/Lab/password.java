package Lab;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();

        while (!password.equals(password)) {

            password = scanner.nextLine();
        }
        System.out.println("Welcome " + name + "!");


    }
}
