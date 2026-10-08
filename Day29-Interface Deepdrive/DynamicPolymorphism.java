public class DynamicPolymorphism {
    public static void main(String[] args) {
        Payment p = new DebitCard();// dynamic action yha hoga, jo bhi class dalegi uska hi method call hoga.
        p.pay();
    }
}
// Dynamic polymorphism or Dynamic Dispatch.// it means ki ye run time pr decide krta ha.
interface Payment{
    void pay();
}
class CreditCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("Paying via Credit Card");
    }
}
class DebitCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("Paying via Debit Card");
    }
}