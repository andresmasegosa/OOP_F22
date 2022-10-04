package session4.E_ChangingDesign;

/**
 * Exercise:
 *   a) Run the code and realise that current implementation can give rise to inconsistencies.
 *   b) Use the methods "getPositionXOfChessPiece(...)" and "getPositionXOfChessPiece(...)" of
 *   ChessBoard class to remove the fields "x" and "y" and methods "setX" and "setY" from ChessPiece class.
 */
public class Exercise {
    public static void main(String[] args) {

        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();
        ChessPiece queen = new Queen(chessBoard,"Black", 0, 7);


        //Start to move pieces
        boolean success = chessBoard.moveChessPiece(queen,0,1);
        System.out.println("Successful movement? " + success);

        System.out.println("\n\nChess Piece at position (0,1): " + chessBoard.getChessPiece(0,1));

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session4_E", I_did_finish, I_did_understand, comment);
    */
    }
}
