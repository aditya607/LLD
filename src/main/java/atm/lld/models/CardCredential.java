package atm.lld.models;

public class CardCredential {

    private String cardNumber ;
    private String cardPin;

    public CardCredential(String cardNumber, String cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPin() {
        return cardPin;
    }

    public void setCardPin(String cardPin) {
        this.cardPin = cardPin;
    }
}
