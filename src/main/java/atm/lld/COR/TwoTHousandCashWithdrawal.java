package atm.lld.COR;

import atm.lld.ATM;
import atm.lld.models.Card;

public class TwoTHousandCashWithdrawal extends CashWithgrawalPreprocessor {

    public TwoTHousandCashWithdrawal(CashWithgrawalPreprocessor cashWithgrawalPreprocessor) {
        super(cashWithgrawalPreprocessor);
    }

    @Override
    public void withdraw(ATM atm, Card card, int amount) {
        System.out.println("withdrwaing in 2000");
        super.withdraw(atm, card, amount);
    }
}
