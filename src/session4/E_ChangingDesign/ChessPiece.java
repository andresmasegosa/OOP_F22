package session4.E_ChangingDesign;

import java.util.Objects;

public abstract class ChessPiece {

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

    public abstract boolean isLegalTheMovement(int newX, int newY);

    @Override
    public String toString() {
        return "ChessPiece{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessPiece that = (ChessPiece) o;
        return type.equals(that.type) && color.equals(that.color);
    }



    @Override
    public int hashCode() {
        return Objects.hash(type, color);
    }
}
