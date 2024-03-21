package atm.lld.COR;

import atm.lld.ATM;
import atm.lld.models.Card;

public abstract class CashWithgrawalPreprocessor {

    CashWithgrawalPreprocessor cashWithgrawalPreprocessor;

    public CashWithgrawalPreprocessor(CashWithgrawalPreprocessor cashWithgrawalPreprocessor) {
        this.cashWithgrawalPreprocessor = cashWithgrawalPreprocessor;
    }

    public void withdraw(ATM atm, Card card, int amount) {


        if(cashWithgrawalPreprocessor == null) {
            return;
        }
            cashWithgrawalPreprocessor.withdraw(atm, card, amount);
    }
}
