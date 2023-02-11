import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projectNum = Integer.parseInt(scanner.nextLine());
        int hoursneeded = projectNum * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName,hoursneeded, projectNum
        );
    }

}
