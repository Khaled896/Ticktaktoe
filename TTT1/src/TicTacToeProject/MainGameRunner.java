
package TicTacToeProject;

import java.util.Scanner;

class MainGameRunner {
    private int row, col;
Scanner scanner = new Scanner(System.in);



ShowBoard board1 = new ShowBoard();
private PlaceTaken fullPlace = new PlaceTaken();
char[][] XOboard = ShowBoard.XOboard;
PlaceAvailable noPlace = new PlaceAvailable();
PlayerTurnChange playerChanger = new PlayerTurnChange();
WinnerCheck winner = new WinnerCheck();



void StartGame() {


    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
            XOboard[i][j] = '_';
        }
    }


    board1.printBoard();
    while (winner.WhoIsWinner()) {

        row = scanner.nextInt(); //user enters indexes to input x or o
        col = scanner.nextInt();
        if (row > 6 || col > 7) {
            System.out.println("The place you inputed is out of the board!\nTry again!");

        } else {
            if (fullPlace.isFull(row, col)) {
                System.err.println(" place taken");

            } else {
                XOboard[row - 1][col - 1] = playerChanger.getTurn();
                board1.printBoard();
                playerChanger.changeplayer();
            }

        }


    }
    playerChanger.changeplayer(); //turn is changed for the print statement below to be correct
    System.out.println("The winner is " + playerChanger.getTurn());
}
}