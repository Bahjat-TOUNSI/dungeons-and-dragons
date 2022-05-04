import java.util.Scanner;

public class Menu {

    public void launch() {
        Hero toto;
        Scanner playOrQuit = new Scanner(System.in);
        System.out.println("Press 1 to Play or 0 to Quit");
        int userChoice = playOrQuit.nextInt();
        if (userChoice == 1) {
            System.out.println("let's play!!!");
            Scanner playerChoice = new Scanner(System.in);
            System.out.println("Choose your class, 1 for Warrior or 2 for Mage");
            int chosenCharacter = playerChoice.nextInt();
            toto = selectClass(chosenCharacter);
            System.out.println(toto);
            playGame();
        }if (userChoice == 0){
            System.out.println("Sorry to see you go");
        } else if (userChoice != 1) {
            System.out.println("Error Please choose 1 or 0");
        }
    }

    public Hero selectClass(int chosenCharacter){
        Hero hero;
        if (chosenCharacter == 1) {
            System.out.println("You chose the Warrior class!");
            System.out.println("What is your name?");
            hero = displayInfoWarrior();
        }else if (chosenCharacter == 2) {
            System.out.println("You chose the Mage class!");
            System.out.println("What is your name?");
            hero =  displayInfoMage();
        }else hero = new Warrior();
        return hero;
    }
    public Hero displayInfoWarrior() {
        Warrior warrior = new Warrior();
        Scanner input = new Scanner(System.in);
        warrior.setName(input.nextLine());
        return warrior;
    }

    public Hero displayInfoMage() {
        Mage mage = new Mage();
        Scanner input = new Scanner(System.in);
        mage.setName(input.nextLine());
        return mage;
    }

    public void playGame() {
        Board play = new Board();
        play.goToTheEnd();
    }

}
