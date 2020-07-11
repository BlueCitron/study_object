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

    public boolean hasInvitation() {
        return Objects.nonNull(this.invitation);
    }

    public boolean hasTicket() {
        return Objects.nonNull(this.ticket);
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Long minusAmount(Long amount) {
        this.amount -= amount;
        return amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

}
