package atm.lld.Impl;

import atm.lld.ATM;
import atm.lld.ATMState;
import atm.lld.models.Card;

public class IdalState implements ATMState {

    public IdalState() {
    }

    @Override
    public void insertCard(ATM atm,Card card) {
        System.out.println("card is inserted");
        atm.setAtmState(new CashWithdrawalState());
    }

    @Override
    public void autheticate(ATM atm, Card card, String pin) {
        throw new RuntimeException("please insert your card first");
    }

    @Override
    public void withDrawCash(ATM atm) {
        throw new RuntimeException("please insert your card first");
    }

    @Override
    public void checkBalance(ATM atm) {
        throw new RuntimeException("please insert your card first");
    }

    @Override
    public void removeCard(ATM atm) {
        throw new RuntimeException("please insert your card first");
    }
}
