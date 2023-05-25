import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the casino!");
        System.out.println("Player 1, what's your name?");
        String name1 = scan.nextLine();
        System.out.println("Player 2, what's your name?");
        String name2 = scan.nextLine();

        Player player1 = new Player(name1, "🔴");
        Player player2 = new Player(name2, "🟡");

        System.out.println("[Game Menu]");
        System.out.println("1. Connect Four");
        System.out.println("-----------------------------");
        System.out.println("Make your selection: ");
        int choice = scan.nextInt();
        ConnectFour game1 = new ConnectFour(player1, player2);
        game1.play();
    }
}
