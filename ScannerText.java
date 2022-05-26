import java.util.Scanner;

public class ScannerText {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a character");
    char c = scanner.next().charAt(0);
    System.out.println("value = " + c);
  }
}