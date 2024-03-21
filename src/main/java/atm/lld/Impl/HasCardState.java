package atm.lld.Impl;

import atm.lld.ATM;
import atm.lld.ATMState;
import atm.lld.models.Card;

public class HasCardState implements ATMState {

    public HasCardState() {
        System.out.println("enter the pin please");
    }

    @Override
    public void insertCard(ATM atm, Card card) {
        throw new RuntimeException("card is already inserted");
    }

    @Override
    public void autheticate(ATM atm, Card card , String pin) {

        int a = 5;

    }

    @Override
    public void withDrawCash(ATM atm) {
        throw new RuntimeException("authticate first");
    }

    @Override
    public void checkBalance(ATM atm) {
        throw new RuntimeException("authticate first");
    }

    @Override
    public void removeCard(ATM atm) {
        throw new RuntimeException("authticate first");
    }
}
