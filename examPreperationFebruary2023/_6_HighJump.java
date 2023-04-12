import java.util.Scanner;

public class _6_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int stratingHeight = target - 30;
        boolean isFailed = false;
        int jumps = 0;
        while (stratingHeight <= target) {
            for (int i = 1; i <= 3; i++) {
                int currentHeight = Integer.parseInt(scanner.nextLine());
                jumps++;
                if (currentHeight > stratingHeight) {
                    stratingHeight += 5;
                    break;
                }
                if (i == 3) {
                    isFailed = true;
                    break;
                }
            }
            if (isFailed) {
                break;
            }
        }
if(isFailed){
    System.out.printf("Tihomir failed at %dcm after %d jumps.", stratingHeight, jumps);
}else{
    System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",stratingHeight-5, jumps);
}
    }
}
