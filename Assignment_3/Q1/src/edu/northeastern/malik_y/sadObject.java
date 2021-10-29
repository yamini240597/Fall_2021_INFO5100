package edu.northeastern.malik_y;

public class sadObject extends moodyObject {
    public String getMood(){
        return "sad";
    }

    public void expressFeelings(){
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob‘");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}
