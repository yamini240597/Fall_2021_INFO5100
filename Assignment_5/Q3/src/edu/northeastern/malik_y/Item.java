package edu.northeastern.malik_y;

public class Item extends ShoppingCart{
    String ID;
    int price;

    //constructor
    public Item(String ID, int price){
        this.ID = ID;
        this.price = price;
    }

    public String getID(){
        return ID;
    }

    public int getPrice(){
        return price;
    }
}
