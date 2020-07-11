public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return this.ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = this.ticketOffice.getTicket();
        Long fee = audience.buy(ticket);
        this.ticketOffice.plusAmount(fee);
    }

}
