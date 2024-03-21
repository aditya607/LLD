package atm.lld.models;

public class Card {

    CardType cardTpe;
    String cardNumber;

    private BankAccount bankAccount;

    public Card(CardType cardTpe, String cardNumber, BankAccount bankAccount) {
        this.cardTpe = cardTpe;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public CardType getCardTpe() {
        return cardTpe;
    }

    public void setCardTpe(CardType cardTpe) {
        this.cardTpe = cardTpe;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardTpe=" + cardTpe +
                ", cardNumber='" + cardNumber + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
