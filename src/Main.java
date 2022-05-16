
import game.Board;
import game.Game;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        Game game = new Game();
        while (game.getStillPlaying()) {
            System.out.println("Bienvenue sur le jeu !");
            game.setHero(game.setAndCreateNewHero());
            System.out.println("Bravo ! vous avez crée votre personnage. Que voulez-vous faire maintenant ?");
            game.setBoard(new Board()) ;
            while (game.getDisplayMenu()) {
                game.displayMenu();
            }
            game.displayEndOfGameMenu();
        }
//        DataBase test = new DataBase();
//        test.getHero();
    }
}
