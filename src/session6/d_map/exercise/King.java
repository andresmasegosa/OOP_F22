package session6.d_map.exercise;

public class King extends ChessPiece {

    public King(ChessBoard chessBoard, String color, Position initialPosition) {
        super(chessBoard,"King",color, initialPosition);
    }

    @Override
    public boolean isLegalTheMovement(Position newPosition){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.chessBoard, this.getPosition(), newPosition, 1) ||
                Movements.isLegalHorizontalMovement(this.chessBoard, this.getPosition(), newPosition, 1) ||
                Movements.isLegalDiagonalMovement(this.chessBoard, this.getPosition(), newPosition, 1);

        return success;
    }

    @Override
    public String toString() {
        return "King{" +
                "position=" + position +
                '}';
    }
}
