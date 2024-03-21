package atm.lld.Impl;

import atm.lld.ATM;
import atm.lld.ATMState;
import atm.lld.COR.CashWithgrawalPreprocessor;
import atm.lld.COR.TwoTHousandCashWithdrawal;
import atm.lld.COR.fiveHundredCashWithdrawal;
import atm.lld.COR.ontHundredCashWithdrawal;
import atm.lld.models.Card;

public class CashWithdrawalState  implements ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {

    }

    @Override
    public void autheticate(ATM atm, Card card, String pin) {

    }

    @Override
    public void withDrawCash(ATM atm) {

        CashWithgrawalPreprocessor cashWithgrawalPreprocessor = new TwoTHousandCashWithdrawal(
                new fiveHundredCashWithdrawal(new ontHundredCashWithdrawal(null)));
        cashWithgrawalPreprocessor.withdraw(atm, null, 100);

    }

    @Override
    public void checkBalance(ATM atm) {

    }

    @Override
    public void removeCard(ATM atm) {

    }
}
