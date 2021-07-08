package hu.tmx.colony;

import hu.tmx.colony.geometry.Position;

public abstract class Ant{

    private Position position;

    public Ant(){}

    public Ant(int x, int y) {
        this.position = new Position(x, y);
    }

    public abstract void move(int width) throws Exception;

    public Position getPosition() {
        return position;
    }
}
