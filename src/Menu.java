import java.util.Scanner;

public class Menu {

    public void launch() {
        Scanner playOrQuit = new Scanner(System.in);
        Board play = new Board();
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
                displayInfoWarrior();
            }if (chosenCharacter == 2) {
                System.out.println("You chose the Mage class!");
                System.out.println("What is your name?");
                displayInfoMage();
            }
            play.goToTheEnd();
        }if (userChoice == 0){
            System.out.println("Sorry to see you go");
        } else if (userChoice != 1) {
            System.out.println("Error Please choose 1 or 0");
        }
    }
    public void displayInfoWarrior() {
        Warrior warrior = new Warrior();
        Scanner input = new Scanner(System.in);
        warrior.setName(input.nextLine());
        System.out.println(warrior);
    }

    public void displayInfoMage() {
        Mage mage = new Mage();
        Scanner input = new Scanner(System.in);
        mage.setName(input.nextLine());
        System.out.println(mage);
    }
}
