package session6.d_map.exercise;

public abstract class ChessPiece {

    private String type;
    private String color;
    protected Position position;
    protected ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color, Position position) {
        this.chessBoard = chessBoard;
        this.type = type;
        this.color = color;
        this.chessBoard.setInitialPositionChessPiece(position, this);
    }

    public String getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    public abstract boolean isLegalTheMovement(Position position);

}
