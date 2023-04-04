package Exercise;

import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTicketCount = 0;
        int standartTicketCount = 0;
        int kidTicketCount = 0;
        int countAllTickets = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String movieName = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int currentTickets = 0;
            String typeTicket = scanner.nextLine();
            while (!typeTicket.equals("End")) {

                countAllTickets++;
                currentTickets++;
                if (typeTicket.equals("student")) {
                    studentTicketCount++;
                } else if (typeTicket.equals("standard")) {
                    standartTicketCount++;
                } else if (typeTicket.equals("kid")) {
                    kidTicketCount++;
                }
                if (currentTickets >= freeSeats) {
                    break;
                }
                typeTicket = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, currentTickets * 1.0 / freeSeats*100);
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", countAllTickets);
        System.out.printf("%.2f%% student tickets.\n", studentTicketCount * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standartTicketCount * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kidTicketCount * 1.0 / countAllTickets * 100);
    }
}

