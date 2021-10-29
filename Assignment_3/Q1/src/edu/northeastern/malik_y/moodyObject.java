package edu.northeastern.malik_y;

abstract class moodyObject {
    abstract String getMood();
    abstract void expressFeelings();

    public void queryMood(){
        System.out.println("I feel " + getMood() + "today!!");
    }
}
