import java.util.Scanner;

public class temperature {

  public static void main(String[] args) {

    String origin = "C";
    String destination = "C";
    double temperature = 0;

    do {
      System.out.print("Enter an origin scale: ");
    } while (!(origin.equals("C")) || !(origin.equals("F")) || !(origin.equals("K")));

    do {
      System.out.print("Enter a destination scale: ");
    } while (!(destination.equals("C")) || !(destination.equals("F")) || !(destination.equals("K")));

    do {
      System.out.print("Enter a temperature: ");
    } while (temperature != 0);


  }

}

in.close();
