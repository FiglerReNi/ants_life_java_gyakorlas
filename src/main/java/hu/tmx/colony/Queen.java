package hu.tmx.colony;

public class Queen {

    private Position position;

    public Position getPosition() {
        return position;
    }

    public Queen(int x, int y) {
        this.position = new Position(x, y);
    }
}
