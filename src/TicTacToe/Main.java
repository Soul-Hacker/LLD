package TicTacToe;

public class Main {
    public static void main(String[] args)
    {
        GameStart game = new GameStart();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());

    }
}
