package session3.C_DesignWithAbstractClass;

public class King extends ChessPiece {

    public King(ChessBoard chessBoard, String color, int x, int y) {
        super(chessBoard,"King",color, x, y);
    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.chessBoard, x, y, newX, newY, 1) ||
                Movements.isLegalHorizontalMovement(this.chessBoard, x, y, newX, newY, 1) ||
                Movements.isLegalDiagonalMovement(this.chessBoard, x, y, newX, newY, 1);

        return success;
    }

}
