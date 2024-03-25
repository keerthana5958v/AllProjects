


public class Card {
    private String cardNumber;
    private String expiryDate;
    private int cvv;
    private int balance;
    Card() {
    }
    public Card(String cardNumber, String cardHolder, String expiryDate, int cvv, String cardType) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


}
class CreditCard extends Card {
    private String cardType;
    private String cardHolder;
    private int maximumAmount;
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public CreditCard(String cardNumber,String cardHolder, String expiryDate, int cvv, String cardType) {
        super(cardNumber,cardHolder,expiryDate, cvv, cardType);
        this.cardHolder = cardHolder;
        this.balance = 0;
        this.cardType = cardType;
        this.maximumAmount = 0;
    }
    public void setAmountLimit() {
        switch (cardType) {
            case "platinum":
                maximumAmount = 200000;
                break;

            case "gold":
                maximumAmount = 100000;
                break;
            case "silver":
                maximumAmount = 50000;
                break;

            default:
                maximumAmount = 0;
                break;
        }
    }
    public void useCard(int amount) {
        int remainBalance = this.maximumAmount - amount;
        if (remainBalance < 0) {
            System.out.println("Exceeding your maximum soceity");
        }
        else {
            this.balance = remainBalance;
        }
    }
}
class DebitCard extends Card {
    private String cardType;
    private String cardHolder;
    private int maximumAmount;
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public DebitCard(String cardNumber,String cardHolder, String expiryDate, int cvv, String cardType) {
        super(cardNumber,cardHolder,expiryDate, cvv, cardType);
        this.cardHolder = cardHolder;
        this.balance = 0;
        this.cardType = cardType;
        this.maximumAmount = 0;
    }
    public void setAmountLimit() {
        switch (cardType) {
            case "platinum":
                maximumAmount = 200000;
                break;

            case "gold":
                maximumAmount = 100000;
                break;
            case "silver":
                maximumAmount = 50000;
                break;

            default:
                maximumAmount = 0;
                break;
        }
    }
    public void useCard(int amount) {
        int remainBalance = this.maximumAmount - amount;
        if (remainBalance < 0) {
            System.out.println("Exceeding your maximum soceity");
        }
        else {
            this.balance = remainBalance;
        }
    }
}