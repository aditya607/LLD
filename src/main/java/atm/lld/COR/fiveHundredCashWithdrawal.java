package atm.lld.COR;

import atm.lld.ATM;
import atm.lld.models.Card;

public class fiveHundredCashWithdrawal extends CashWithgrawalPreprocessor {

    public fiveHundredCashWithdrawal(CashWithgrawalPreprocessor cashWithgrawalPreprocessor) {
        super(cashWithgrawalPreprocessor);
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) {
        System.out.println("withdrwaing in 500");
        super.withdraw(atm, card, amount);
    }
}
