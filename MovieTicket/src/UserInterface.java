import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name");
        String movie = sc.nextLine();

        System.out.println("Enter no of bookings");
        int bookings = sc.nextInt();

        System.out.println("Enter the available tickets");
        int avail = sc.nextInt();
        Ticket.setAvailableTickets(avail);

        for (int i = 1; i <= bookings; i++) {

            Ticket t = new Ticket();

            System.out.println("Enter the ticketid");
            int id = sc.nextInt();
            t.setTicketid(id);

            System.out.println("Enter the price");
            int price = sc.nextInt();
            t.setPrice(price);

            System.out.println("Enter the no of tickets");
            int count = sc.nextInt();

            System.out.println("Available tickets: " + Ticket.getAvailableTickets());

            if (Ticket.getAvailableTickets() == 0) {
                System.out.println("House full");
                break;
            }

            int amount = t.calculateTicketCost(count);

            if (amount == -1) {
                System.out.println("Tickets are not available");
            } else {
                System.out.println("Total amount: " + amount);

                if (Ticket.getAvailableTickets() == 0) {
                    System.out.println("House full");
                    break;
                } else {
                    System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
                }
            }
        }

        sc.close();
    }
}
