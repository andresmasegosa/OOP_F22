package session6.d_map.solution;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {

    private Map<Position,ChessPiece> pieces;

    public ChessBoard() {
        pieces = new HashMap<>();
    }

    public ChessPiece getChessPiece(Position position){
        return pieces.get(position);
    }

    public void setInitialPositionChessPiece(Position position, ChessPiece piece){
        this.pieces.put(position,piece);
        piece.setPosition(position);
    }

    public boolean moveChessPiece(ChessPiece piece, Position newPosition){
        boolean success = piece.isLegalTheMovement(newPosition);
        if (!success)
            return false;
        this.pieces.remove(piece.getPosition());
        this.pieces.put(newPosition,piece);
        piece.setPosition(newPosition);
        return success;
    }
}
