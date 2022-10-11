package session6.d_map.exercise;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color, Position initialPosition) {
        super(chessBoard,"King",color, initialPosition);
    }

    @Override
    public boolean isLegalTheMovement(Position newPosition){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.chessBoard, this.getPosition(), newPosition, 8) ||
                Movements.isLegalHorizontalMovement(this.chessBoard, this.getPosition(), newPosition, 8) ||
                Movements.isLegalDiagonalMovement(this.chessBoard, this.getPosition(), newPosition, 8);

        return success;
    }

    @Override
    public String toString() {
        return "Queen{" +
                "position=" + position +
                '}';
    }
}
