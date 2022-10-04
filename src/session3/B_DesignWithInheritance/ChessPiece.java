package session3.B_DesignWithInheritance;

public class ChessPiece {

    private String type;
    private String color;
    protected int x;
    protected int y;
    protected ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color, int x, int y) {
        this.chessBoard = chessBoard;
        this.type = type;
        this.color = color;
        this.chessBoard.setInitialPositionChessPiece(x,y,this);
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    public boolean isLegalTheMovement(int newX, int newY){
        return false;
    }

}
