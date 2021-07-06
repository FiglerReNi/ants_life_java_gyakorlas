package hu.tmx.colony;

public class Ants {

    private Position position;

    public Ants(){};

    public Ants(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return this.getPosition().toString();
    }
}
