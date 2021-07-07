package hu.tmx.colony;

import hu.tmx.colony.geometry.Position;

public abstract class Ant{

    private Position position;

    public Ant(){}

    public Ant(int x, int y) {
        this.position = new Position(x, y);
    }

    void move(int width){}

    public Position getPosition() {
        return position;
    }
}
