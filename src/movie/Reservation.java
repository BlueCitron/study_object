package movie;

public class Reservation {

    private Customer customer;
    private Screening screening;
    private Money fee;
    private Integer audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, Integer audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
