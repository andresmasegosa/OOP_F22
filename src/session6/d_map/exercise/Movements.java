package session6.d_map.exercise;


public  class Movements {
    public static boolean isLegalHorizontalMovement(ChessBoard board, Position position1, Position position2, int maxDistance)
    {

        int x1 = position1.getX();
        int y1 = position1.getY();
        int x2 = position2.getX();
        int y2 = position2.getY();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If not moving, moving vertically or further than allowed
        if (dx == 0 || dy != 0 || dx > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int lower = Math.min(x1, x2) + 1;
        int higher = Math.max(x1, x2);

        for (; lower < higher; lower++)
            if (board.getChessPiece(new Position(lower,y1)) != null)
                return false; // False if trying to pass over another piece

        return true; // All according to the rules
    }

    public static boolean isLegalVerticalMovement(ChessBoard board, Position position1, Position position2, int maxDistance)
    {
        int x1 = position1.getX();
        int y1 = position1.getY();
        int x2 = position2.getX();
        int y2 = position2.getY();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If moving horizontally, not moving or further than allowed
        if (dx != 0 || dy == 0 || dy > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int lower = Math.min(y1, y2) + 1;
        int higher = Math.max(y1, y2);

        for (; lower < higher; lower++)
            if (board.getChessPiece(new Position(x1,lower)) != null)
                return false; // False if trying to pass over another piece

        return true; // All according to the rules
    }

    public static boolean isLegalDiagonalMovement(ChessBoard board, Position position1, Position position2, int maxDistance)
    {
        int x1 = position1.getX();
        int y1 = position1.getY();
        int x2 = position2.getX();
        int y2 = position2.getY();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        maxDistance = Math.abs(maxDistance);

        // If not purely diagonal or further movement than allowed
        if (dx != dy || dx > maxDistance)
            return false;

        // Check if piece passed any other piece in order to make this move
        int currX = x1 + (x2 < x1 ? -1 : 1);
        int currY = y1 + (y2 < y1 ? -1 : 1);
        while (currX != x2 && currY != y2)
        {
            if (board.getChessPiece(new Position(currX,currY)) != null)
                return false;

            currX += (x2 < x1 ? -1 : 1);
            currY += (y2 < y1 ? -1 : 1);
        }

        return true;
    }
}
