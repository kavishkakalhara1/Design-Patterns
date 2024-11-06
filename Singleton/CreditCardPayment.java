
//Strategy Interface
public interface PaymentStrategy {
    void pay(double amount);
}

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card " + cardNumber);
    }
}


//Implement Concrete Strategies
public class PayPalPayment implements PaymentStrategy {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account " + email);
    }
}

//Create the Context
public class GooglePayPayment implements PaymentStrategy {
    private String phoneNumber;
    
    public GooglePayPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Google Pay with phone " + phoneNumber);
    }
}

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}

//Using the Strategy Pattern in Client Code
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new PayPalPayment("user@example.com"));
        cart.checkout(100.0); // Output: Paid 100.0 using PayPal account user@example.com

        cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(250.0); // Output: Paid 250.0 using Credit Card 1234-5678-9012-3456

        cart = new ShoppingCart(new GooglePayPayment("+123456789"));
        cart.checkout(75.0);  // Output: Paid 75.0 using Google Pay with phone +123456789
    }
}
