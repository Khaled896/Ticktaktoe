
package TicTacToeProject;

public class PlaceAvailable {
char[][] board = ShowBoard.XOboard;

public boolean OutOfBoard(int row, int col) {
    if (row > 6 || col > 7) {
        System.err.println("There is no row or column");
        return true;

    }
    return false;

}
}
