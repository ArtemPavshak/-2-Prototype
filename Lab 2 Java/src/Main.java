public class Main {
    public static void main(String[] args) {
        MovieTicket regularTicket = new MovieTicket("Пірати карибського моря", "Кінотеатр Чернівці", "18:30", 200);
        MovieTicket vipTicket = new MovieTicket("Персі Джексон", "Кінотеатр Кобилянської", "20:00", 350);

        TicketRegistry ticketRegistry = new TicketRegistry();
        ticketRegistry.addTicketPrototype("regular", regularTicket);
        ticketRegistry.addTicketPrototype("vip", vipTicket);

        MovieTicket clonedTicket1 = ticketRegistry.getTicketClone("regular");
        MovieTicket clonedTicket2 = ticketRegistry.getTicketClone("vip");

        System.out.println("Cloned Ticket 1: " + clonedTicket1);
        System.out.println("Cloned Ticket 2: " + clonedTicket2);
    }
}