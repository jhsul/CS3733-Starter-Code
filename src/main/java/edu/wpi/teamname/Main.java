package edu.wpi.teamname;

public class Main {

  public static void main(String[] args) {
    App.launch(App.class, args);

    System.out.println("Neville Ingram");
    System.out.println("Jack");
    System.out.println("Brian");
    System.out.println("Freud");

    TextPrinter printer1= new TextPrinter("Get out of here");
    printer1.getTextOut();
  }
}
