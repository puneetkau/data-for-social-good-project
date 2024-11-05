import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

/*
 * Instantiates an airlines object and calls the toString.
 */ 

airlines ab = new airlines("cancels.txt", "delays.txt");
    System.out.println(ab);
  }
}