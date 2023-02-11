package Lab;

import java.util.Scanner;

public class guessThePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password ="s3cr3t!P@ssw0rd";

        if(name.equals(password)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }



    }
}
