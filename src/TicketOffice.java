import java.util.ArrayList;
import java.util.List;

public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public Ticket getTicket() {
        return this.tickets.remove(0);
    }

    public Long minusAmount(Long amount) {
        this.amount -= amount;
        return amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
