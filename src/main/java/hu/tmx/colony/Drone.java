package hu.tmx.colony;

import hu.tmx.colony.geometry.Direction;
import static hu.tmx.colony.geometry.RandomGenerator.directionRandom;

public class Drone extends Ant{

    private int stayWithQueenCounter = 0;

    public Drone(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int width) {
        if(getPosition().getX() != width/2){
            if(getPosition().getX() > width/2)
                getPosition().changePosition(Direction.WEST, width, 1);
            else
                getPosition().changePosition(Direction.EAST, width, 1);
        }else if(getPosition().getY() != width/2){
            if(getPosition().getY() > width/2)
                getPosition().changePosition(Direction.SOUTH, width, 1);
            else
                getPosition().changePosition(Direction.NORTH, width, 1);
        }
        if(getPosition().getX() == width/2 && getPosition().getY() == width/2){
            if(stayWithQueenCounter == 10) {
                stayWithQueenCounter = 0;
                Direction direction = directionRandom();
                switch (direction) {
                    case EAST:
                    case NORTH:
                        getPosition().changePosition(direction, width, ((width / 2) - 1));
                        break;
                    case WEST:
                    case SOUTH:
                        getPosition().changePosition(direction, width, ((width / 2)));
                        break;
                }
            }
            stayWithQueenCounter++;
        }
    }
}
