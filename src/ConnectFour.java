import java.util.Scanner;
public class ConnectFour {

    private Player player1;
    private Player player2;


    public ConnectFour(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        Rack gameBoard = new Rack();
        while (/*!inARow*/) {
            System.out.println("Player 1, what column do you want to place your piece in:");
            int idx = scan.nextInt();
            gameBoard.insertPiece(idx, player1);
            gameBoard.display();
            System.out.println("Player 2, what column do you want to place your piece in:");
            int idx2 = scan.nextInt();
            gameBoard.insertPiece(idx2, player2);
            gameBoard.display();
        }
    }
}
