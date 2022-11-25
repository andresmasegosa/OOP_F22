package session11.solutions.a_exercise_strategy_pattern_solution;

import session11.solutions.a_exercise_strategy_pattern_solution.payments_apis.MasterCard;

public class PaymentByMasterCard implements PaymentMethod{
    MasterCard card;

    public PaymentByMasterCard(MasterCard card) {
        this.card = card;
    }

    @Override
    public boolean pay(double quantity) {
        return card.chargeToTheCreditCard(quantity);
    }
}
