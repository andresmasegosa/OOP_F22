package session3.A_DesignNoInterfaceNoInheritance;

/**
 * Exercise:
 *  * a) Discuss the constructor for the class.
 *  * b) Create, when needed, Getters and Setters for the fields of the class.
 **/

public class ChessPiece {

    private String type; // e.g. "King" or "Queen".
    private String color; //"White" or "Black"
    private int x; //position X in the chess board
    private int y; //position Y in the chess board
    private ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color, int x, int y) {
        this.type = type;
        this.color = color;
        this.x = x;
        this.y = y;
        this.chessBoard = chessBoard;
        this.chessBoard.setInitialPositionChessPiece(x,y,this);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = false;
        switch(this.type){
            case "King":
                // Do movement
                success = Movements.isLegalVerticalMovement(this.chessBoard, x, y, newX, newY, 1) ||
                                Movements.isLegalHorizontalMovement(this.chessBoard, x, y, newX, newY, 1) ||
                                Movements.isLegalDiagonalMovement(this.chessBoard, x, y, newX, newY, 1);
                break;
            case "Queen":
                success =
                        Movements.isLegalVerticalMovement(this.chessBoard, x, y, newX, newY, 8) ||
                                Movements.isLegalHorizontalMovement(this.chessBoard, x, y, newX, newY, 8) ||
                                Movements.isLegalDiagonalMovement(this.chessBoard, x, y, newX, newY, 8);
                break;
            case "Bishop":
                success = Movements.isLegalDiagonalMovement(this.chessBoard, x, y, newX, newY, 8);
        }
        return success;
    }

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();
        ChessPiece whiteKing = new ChessPiece(chessBoard, "King", "White", 0,5);
        whiteKing.setX(1);
        whiteKing.setY(6);


        String type = whiteKing.getType();
        String color = whiteKing.getColor();
        ChessBoard chessBoard1 = whiteKing.getChessBoard();

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/


        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session3_A_ChessPiece", I_did_finish, I_did_understand, comment);

    }

}
