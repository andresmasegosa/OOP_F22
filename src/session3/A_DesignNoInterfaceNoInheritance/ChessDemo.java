package session3.A_DesignNoInterfaceNoInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();
        ChessPiece king = new ChessPiece(chessBoard,"King", "Black", 0, 0);
        ChessPiece queen = new ChessPiece(chessBoard,"Queen", "Black", 1, 0);


        //Start to move pieces
        boolean success = chessBoard.moveChessPiece(king,1,7);
        System.out.println(success);


    }
}
