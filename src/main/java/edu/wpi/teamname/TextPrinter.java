package edu.wpi.teamname;

public class TextPrinter {
    String name;
    TextPrinter(String name){
        this.name = name;
    }

    void getTextOut(){
        System.out.println(this.name);
    }
}
