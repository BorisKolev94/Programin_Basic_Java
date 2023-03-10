package Exercise;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int totalSpace = width * length * height;
        String command = scanner.nextLine();
        Boolean noMoreSpace = false;
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            totalSpace = totalSpace - boxes;
            if (totalSpace <= 0) {
                noMoreSpace = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (noMoreSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalSpace));
        }else{
            System.out.printf("%d Cubic meters left.", totalSpace);
        }
    }
}

