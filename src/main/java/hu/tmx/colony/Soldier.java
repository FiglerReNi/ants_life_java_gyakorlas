package hu.tmx.colony;

import hu.tmx.colony.geometry.Direction;

public class Soldier extends Ants implements Behavior{

    public Soldier(int x, int y) {
        super(x, y);
    }

    private Direction lastDirection = Direction.NORTH;

    @Override
    public void move() {
        getPosition().changeDirection(lastDirection);
        switch (lastDirection) {
            case NORTH:
                lastDirection = Direction.EAST;
                break;
            case EAST:
                lastDirection = Direction.SOUTH;
                break;
            case SOUTH:
                lastDirection = Direction.WEST;
                break;
            case WEST:
                lastDirection = Direction.NORTH;
                break;
        }
    }
}
