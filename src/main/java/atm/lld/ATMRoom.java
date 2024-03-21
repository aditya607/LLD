package atm.lld;

import atm.lld.Impl.IdalState;
import atm.lld.models.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMRoom {

    User user;
    ATM atm;

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialise();

        atmRoom.getAtm().getAtmState().insertCard(atmRoom.getAtm(), atmRoom.getUser().getCard());
//        String pin = scanner.nextLine();
//        System.out.println("pin entered :: " + pin);
        atmRoom.getAtm().getAtmState().autheticate(atmRoom.getAtm(), atmRoom.getUser().getCard(), "qbc");
        atmRoom.getAtm().getAtmState().withDrawCash(atmRoom.getAtm());
    }
    public void initialise() {
        Map<CurrencyNote, Integer> currencyNotesCount = new HashMap<>();
        currencyNotesCount.put(CurrencyNote.TWO_THOUSAND, 2);
        currencyNotesCount.put(CurrencyNote.FIVE_HUNDRED, 8);
        currencyNotesCount.put(CurrencyNote.ONE_HUNDRED, 20);
        this.atm  = new ATM(ATMStatus.WORKING_FINE, 1000,  currencyNotesCount, new IdalState());
        
        user =  createNewUser();

    }

    private User createNewUser() {

        BankAccount bankAccount = new BankAccount(3000);
        Card card = new Card(CardType.VISA, "user1_card_number", bankAccount);
        return new User(card, bankAccount);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }
}
