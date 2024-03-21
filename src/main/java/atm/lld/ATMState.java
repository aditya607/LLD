package atm.lld;

import atm.lld.models.Card;

public interface ATMState {

    public void insertCard(ATM atm, Card card);

    public void autheticate(ATM atm, Card card, String pin);

    public void withDrawCash(ATM atm);

    public void checkBalance(ATM atm);

    public void removeCard(ATM atm);

}
