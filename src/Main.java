import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Warrior warrior = new Warrior();
//        System.out.println(warrior.getName());
        Scanner playOrQuit = new Scanner(System.in);
        System.out.println("Press 1 to Play or 0 to Quit");
        Integer userChoice = playOrQuit.nextInt();
        if (userChoice == 1) {
            System.out.println("let's play!!!");
            Scanner playerChoice = new Scanner(System.in);
            System.out.println("Choose your class, 1 for Warrior or 2 for Mage");
            Integer chosenCharacter = playerChoice.nextInt();
            if (chosenCharacter == 1) {
                System.out.println("You chose the Warrior class!");
            }if (chosenCharacter == 2) {
                System.out.println("You chose the Mage class!");
            }
        }if (userChoice == 0){
            System.out.println("Sorry to see you go");
        } else if (userChoice != 1) {
            System.out.println("Error Please choose 1 or 0");
        }
    }
}
