package atm.lld.COR;

import atm.lld.ATM;
import atm.lld.models.Card;

public class ontHundredCashWithdrawal extends CashWithgrawalPreprocessor {

    public ontHundredCashWithdrawal(CashWithgrawalPreprocessor cashWithgrawalPreprocessor) {
        super(cashWithgrawalPreprocessor);
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) {
        System.out.println("withdrwaing in 100");
            super.withdraw(atm, card, amount);

    }
}
