package edu.northeastern.malik_y;

public class psychiatristObject {
    public void examine(moodyObject moodyObj){
        System.out.println("How are you feeling today?");
        moodyObj.queryMood();
    }

    public void observe(moodyObject moodyObj){
        moodyObj.expressFeelings();
        System.out.println("Observation: " + moodyObj.toString());
    }
}
