package movie.discount;

import movie.Money;
import movie.Screening;
import movie.discount.DiscountPolicy;
import movie.discount.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return this.discountAmount;
    }
}
