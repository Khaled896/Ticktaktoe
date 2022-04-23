
package TicTacToeProject;

public class PlayerTurnChange {
public char turn = 'X'; //initialized as x so x starts the game on first turn

public void changeplayer() {
    if (turn == 'X') {
        turn = 'O';
    } else {
        turn = 'X';    //player switched 

    }
}

public char getTurn() {
    return turn;
}


}
