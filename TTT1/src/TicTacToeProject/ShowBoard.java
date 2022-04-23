
package TicTacToeProject;

public class ShowBoard {
public static char[][] XOboard = new char[6][7]; //board initialzed


public void printBoard() {

    System.out.println("-----------------------------");
    for (int i = 0; i < 6; i++) {
        System.out.print("| ");
        for (int j = 0; j < 7; j++) {

            System.out.print(XOboard[i][j] + " | ");

        }
        System.out.println();

    }
    System.out.println("-----------------------------");

}
}