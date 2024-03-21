package atm.lld;

import atm.lld.models.ATMStatus;
import atm.lld.models.CurrencyNote;

import java.util.Map;

public class ATM {

    ATMStatus atmStatus;

    ATMState atmState;
    int balalnce;

    Map<CurrencyNote, Integer> currencyNotesCount;

    public ATM(ATMStatus atmStatus, int balalnce, Map<CurrencyNote, Integer> currencyNotesCount,ATMState atmState ) {
        this.atmStatus = atmStatus;
        this.balalnce = balalnce;
        this.currencyNotesCount = currencyNotesCount;
        this.atmState = atmState;
    }

    public ATMStatus getAtmStatus() {
        return atmStatus;
    }

    public void setAtmStatus(ATMStatus atmStatus) {
        this.atmStatus = atmStatus;
    }

    public int getBalalnce() {
        return balalnce;
    }

    public void setBalalnce(int balalnce) {
        this.balalnce = balalnce;
    }

    public Map<CurrencyNote, Integer> getCurrencyNotesCount() {
        return currencyNotesCount;
    }

    public void setCurrencyNotesCount(Map<CurrencyNote, Integer> currencyNotesCount) {
        this.currencyNotesCount = currencyNotesCount;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }
}
