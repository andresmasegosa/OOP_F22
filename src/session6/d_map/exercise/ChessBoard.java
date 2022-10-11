package session6.d_map.exercise;

public class ChessBoard {

    private ChessPiece[][] pieces;

    public ChessBoard() {
        pieces = new ChessPiece[8][8];
    }

    public ChessPiece getChessPiece(Position position){
        return pieces[position.getX()][position.getY()];
    }

    public void setInitialPositionChessPiece(Position position, ChessPiece piece){
        this.pieces[position.getX()][position.getY()]=piece;
        piece.setPosition(position);
    }

    public boolean moveChessPiece(ChessPiece piece, Position newPosition){
        boolean success = piece.isLegalTheMovement(newPosition);
        if (!success)
            return false;
        this.pieces[piece.getPosition().getX()][piece.getPosition().getY()]=null;
        this.pieces[newPosition.getX()][newPosition.getY()]=piece;
        piece.setPosition(newPosition);
        return success;
    }
}
