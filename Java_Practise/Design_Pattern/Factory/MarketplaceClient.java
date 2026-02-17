package Design_Pattern.Factory;

interface Payment {
    String pay(double amount);
    String invoice(double amount);
}

class CreditCardPayment implements Payment{
    public String pay(double amount){
        return "Paid by card: "+amount;
    }
    public String invoice(double amount){
        return "Invoice for tk : "+amount;
    }
}

class PayPalPayment implements Payment{
    public String pay(double amount){
        return "Paid by Paypal: "+amount;
    }
    public String invoice(double amount){
        return "Invoice for tk : "+amount;
    }
}

class BankTransferPayment implements Payment{
    public String pay(double amount){
        return "Paid by Bank Transfer: "+amount;
    }
    public String invoice(double amount){
        return "Invoice for tk : "+amount;
    }
}

class PaymentFactory{
    public static Payment create(String method){
        return switch(method){
            case "CARD" -> new CreditCardPayment();
            case "PAYPAL" -> new PayPalPayment();
            case "BANK" ->new BankTransferPayment();
            default -> throw new IllegalArgumentException("Invalid Method."+method);
        };
    }
}

public class MarketplaceClient {
    public String pay(String method,double amount){
        Payment p =PaymentFactory.create(method);
        return p.pay(amount);
    }
    public static void main(String[] args) {
        MarketplaceClient m = new MarketplaceClient();
        System.out.println(m.pay("CARD",10000));
        System.out.println(m.pay("PAYPAL",1300));
        System.out.println(m.pay("BANK",98760));
    }
}