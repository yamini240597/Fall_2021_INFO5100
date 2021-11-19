package edu.northeastern.malik_y;

public class CreditCardStrategy implements PaymentStrategy{
    String cardNumber;

    //constructor
    CreditCardStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void pay (int payment){
        System.out.println("Credit Card: $" + payment);
    }
}
