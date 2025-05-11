
class Payment{
    private double amount;
    double getAmount(){
        return this.amount;
    }
    void setAmount(double ammount){
        this.amount=ammount;
    }
    void proccessPayment(){
        System.out.println("proccessing a generic payment "+getAmount()+" Birr");
    }
}
class CreditPayment extends Payment{
    @Override
    void proccessPayment(){
        System.out.println("proccessing a card payment "+getAmount()+" Birr");
    }
}

class PayPalPayment extends Payment{
    @Override
    void proccessPayment(){
        System.out.println("proccessing a paypal payment "+getAmount()+" Birr");
    }
}
public class RealWorldApplication {
    public static void main(String args[]){
    Payment card=new CreditPayment();
    card.setAmount(100000.0);
    Payment paypal=new PayPalPayment();
 
  
    paypal.setAmount(200000.0);
    card.proccessPayment();
    paypal.proccessPayment();
    }
}
