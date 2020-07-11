import java.util.Objects;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        setTicket(ticket);
        return hasInvitation() ? 0L : minusAmount(ticket.getFee());
    }

    private boolean hasInvitation() {
        return Objects.nonNull(this.invitation);
    }

    private boolean hasTicket() {
        return Objects.nonNull(this.ticket);
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private Long minusAmount(Long amount) {
        this.amount -= amount;
        return amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

}
