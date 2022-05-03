import java.util.Scanner;

public class StartGame {

    public void launch() {
        Scanner playOrQuit = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Warrior warrior = new Warrior();
        Mage mage = new Mage();
        System.out.println("Press 1 to Play or 0 to Quit");
        int userChoice = playOrQuit.nextInt();
        if (userChoice == 1) {
            System.out.println("let's play!!!");
            Scanner playerChoice = new Scanner(System.in);
            System.out.println("Choose your class, 1 for Warrior or 2 for Mage");
            int chosenCharacter = playerChoice.nextInt();
            if (chosenCharacter == 1) {
                System.out.println("You chose the Warrior class!");
                System.out.println("What is your name?");
                warrior.setName(input.nextLine());
                System.out.println(warrior);
            }if (chosenCharacter == 2) {
                System.out.println("You chose the Mage class!");
                System.out.println("What is your name?");
                mage.setName(input.nextLine());
                System.out.println(mage);
            }
        }if (userChoice == 0){
            System.out.println("Sorry to see you go");
        } else if (userChoice != 1) {
            System.out.println("Error Please choose 1 or 0");
        }
    }
}
