package for_Loop_Lab;

import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int lengh = text.length();
        for (int i=0; i<lengh; i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }
    }
}
