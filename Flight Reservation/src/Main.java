public class Main {
    public static void main(String[] args) {
        Passenger passenger1= new Passenger("Dani","Eli","A","034564356935");
        Passenger passenger2= new Passenger("Levy","Potter","B","234242342323");
        Passenger passenger3= new Passenger("Avi","Levy","C","085685868658");
        Passenger passenger4= new Passenger("Avi","Levy","D","568568658685");
        Passenger passenger5= new Passenger("Avi","Levy","E","124214646463");
        Passenger passenger6= new Passenger("Avi","Levy","F","124214241211");
        Passenger passenger7= new Passenger("Avi","Levy","A","124124124214");
        Passenger passenger8= new Passenger("Avi","Levy","B","124421412412");
        Passenger passenger9= new Passenger("Avi","Levy","C","564655646546");
        Passenger passenger10= new Passenger("Avi","Levy","D","45654654654");
        Passenger passenger11= new Passenger("Shmuel","Gafi","E","23443545636");

        TicketReservation ticketReservation = new TicketReservation();

        ticketReservation.bookFlight(passenger1);
        ticketReservation.bookFlight(passenger2);
        ticketReservation.bookFlight(passenger3);
        ticketReservation.bookFlight(passenger4);
        ticketReservation.bookFlight(passenger5);
        ticketReservation.bookFlight(passenger6);
        ticketReservation.bookFlight(passenger7);
        ticketReservation.bookFlight(passenger8);
        ticketReservation.bookFlight(passenger9);
        ticketReservation.bookFlight(passenger10);
        ticketReservation.bookFlight(passenger11);

        ticketReservation.cancel("034564356935");

        ticketReservation.bookFlight(passenger11);
        System.out.println(ticketReservation.toString());

    }
}