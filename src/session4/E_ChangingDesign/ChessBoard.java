package session4.E_ChangingDesign;

public class ChessBoard {

    private ChessPiece[][] pieces;

    public ChessBoard() {
        pieces = new ChessPiece[8][8];
    }

    public ChessPiece getChessPiece(int x, int y){
        return pieces[x][y];
    }

    public void setInitialPositionChessPiece(int x, int y, ChessPiece piece){
        this.pieces[x][y]=piece;
        piece.setX(x);
        piece.setY(y);
    }

    public boolean moveChessPiece(ChessPiece piece, int newX, int newY){
        boolean success = piece.isLegalTheMovement(newX,newY);
        this.pieces[piece.getX()][piece.getY()]=null;
        this.pieces[newX][newY]=piece;
        piece.setX(newX);
        piece.setY(newY);
        return success;
    }

    public int getPositionXOfChessPiece(ChessPiece piece){
        int[] pos = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.getChessPiece(i,j)!=null && this.getChessPiece(i,j).equals(piece)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getPositionYOfChessPiece(ChessPiece piece){
        int[] pos = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (this.getChessPiece(i,j)!=null && this.getChessPiece(i,j).equals(piece)) {
                    return j;
                }
            }
        }
        return -1;
    }
}

