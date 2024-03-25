
import java.time.LocalDateTime;
import java.util.Date;

interface PaymentApp {
    boolean processPayment (double amount);
}

class CreditCard implements PaymentApp {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean processPayment (double amount) {
        System.out.print("Processing card payment of "+amount);
        if (isValidCardNumber(cardNumber) && isValidExpiryDate(expiryDate)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidCardNumber(String cardNumber) {
        int count = 0;
        for(int i=0;i<cardNumber.length();i++){
            if(Character.isDigit(cardNumber.charAt(i))){
                count++;
            }
        }
        if(count==16){
            return true;
        }
        return false;
    }

    private boolean isValidExpiryDate(String date) {
        String[] parts = date.split("/");
        if (parts.length != 2) {
            return false;
        }

        int inputMonth = Integer.parseInt(parts[0]);
        int inputYear = Integer.parseInt(parts[1]);

        LocalDateTime currentDateTime = LocalDateTime.now();
        int currentMonth = currentDateTime.getMonthValue();
        int currentYear = currentDateTime.getYear() % 100;

        if (inputYear > currentYear || (inputYear == currentYear && inputMonth >= currentMonth)) {
            return true;
        }

        return false;
    }

}

class PayPal implements PaymentApp{
    private String email;
    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment (double amount) {
        System.out.print("\nProcessing paypal payment of "+amount);
        if (isValidMail(email)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isValidMail(String mail){
        return mail.contains("@");
    }
}

class PaymentGateway {
    public boolean makePayment (double amount, PaymentApp paymentMethod) {
        return paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentApp creditCard = new CreditCard ("1234-5678-9012-3456", "12/25");
        PaymentApp payPal = new PayPal("user@example.com");
        PaymentGateway paymentGateway = new PaymentGateway();
        boolean creditCardPaymentResult = paymentGateway.makePayment(100.0, creditCard);
        boolean payPalPaymentResult = paymentGateway.makePayment(50.0, payPal);
        System.out.println("\n" + (creditCardPaymentResult ? "Credit card payment successful." : "Credit card payment failed."));
        System.out.println("" + (payPalPaymentResult ? "PayPal payment successful." : "PayPal payment failed."));
    }
}