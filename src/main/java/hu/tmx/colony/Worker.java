package hu.tmx.colony;

import hu.tmx.colony.geometry.Direction;
import hu.tmx.colony.geometry.RandomGenerator;

public class Worker extends Ants implements Behavior{

    public Worker(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {
        getPosition().changeDirection(RandomGenerator.directionRandom());
    }
}
