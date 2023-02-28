package for_Loop_Lab;

import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int letter= 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            switch (symbol) {
                case 'a':
                    letter += 1;
                    break;
                case 'e':
                    letter +=2;
                    break;
                case 'i':
                    letter +=3;
                    break;
                case 'o':
                    letter +=4;
                    break;
                case 'u':
                    letter +=5;
                    break;

            }
        }
        System.out.println(letter);
    }
}
