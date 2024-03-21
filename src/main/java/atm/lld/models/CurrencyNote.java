package atm.lld.models;

public enum CurrencyNote {

    TWO_THOUSAND(2000),
    FIVE_HUNDRED(500),
    ONE_HUNDRED(100);

    public final int value;

    CurrencyNote(int value) {
        this.value = value;
    }
}
