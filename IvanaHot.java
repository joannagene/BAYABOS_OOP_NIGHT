
package ivanahot;

import java.util.Scanner;

public class IvanaHot {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = scanner.nextLine();
        misplacedCapitalisation(message);
    }

    public static void misplacedCapitalisation(String message) {
        boolean misplacedCapitalisation = false;

        for (int i = 1; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            char prevChar = message.charAt(i - 1);
            if (Character.isUpperCase(currentChar)) {
                if (!Character.isWhitespace(prevChar)) {
                    misplacedCapitalisation = true;
                    break;
                }
            }
        }

        if (misplacedCapitalisation) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
}
   
    

