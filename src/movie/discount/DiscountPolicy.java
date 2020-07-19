package movie.discount;

import movie.Money;
import movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
