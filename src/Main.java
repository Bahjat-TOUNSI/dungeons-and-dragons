import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Mage mage = new Mage();
//        System.out.println(mage.name);
        Scanner playOrQuit = new Scanner(System.in);
        System.out.println("Press 1 to Play or 0 to Quit");
        int userChoice = playOrQuit.nextInt();
        if (userChoice == 1) {
            System.out.println("let's play!!!");
            Scanner playerChoice = new Scanner(System.in);
            System.out.println("Choose your class, 1 for Warrior or 2 for Mage");
            int chosenCharacter = playerChoice.nextInt();
            if (chosenCharacter == 1) {
                System.out.println("You chose the Warrior class!");
            }if (chosenCharacter == 2) {
                System.out.println("You chose the Mage class!");
            }
        } else if (userChoice == 0) {
            System.out.println("Sorry to see you go");
        }
        System.out.println("Error please choose 1 or 0");
    }
}
