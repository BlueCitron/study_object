public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            Long fee = audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(fee);
            audience.getBag().setTicket(ticket);
        }
    }
}
