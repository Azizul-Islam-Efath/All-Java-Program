package Level3.Abstraction;

public abstract class Payment {
   public abstract void processPayment();
}

class CreditCard extends Payment{
    public void processPayment(){
        System.out.println("Making Payment Through Credit Card.");
    }
}

class Paypal extends Payment{    
    public void processPayment(){
        System.out.println("Making Payment Through PayPal.");
    }


    public static void main(String[] args) {
        Payment c = new CreditCard();
        c.processPayment();
        
        Payment p = new Paypal();
        p.processPayment();
    }
}

