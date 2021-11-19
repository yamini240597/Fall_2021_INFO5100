package edu.northeastern.malik_y;

public class PayPalStrategy implements PaymentStrategy{
    String email;

    //constructor
    PayPalStrategy(String email){
        this.email = email;
    }

    public void pay(int payment){
        System.out.println("PayPal: $" + payment);
    }
}
