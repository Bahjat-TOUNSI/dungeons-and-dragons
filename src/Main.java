import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner replay = new Scanner(System.in);
        Menu start = new Menu();
        start.launch();
        System.out.println("Again? y or n");
        String result = replay.nextLine();
        if(result.equalsIgnoreCase("y")){
            start.launch();
        }
        System.out.println("Sorry to see you go");
    }
}

