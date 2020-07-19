package movie.discount.condition;

import movie.Screening;

public interface DiscountCondition {
    public boolean isSatisfiedBy(Screening screening);
}
