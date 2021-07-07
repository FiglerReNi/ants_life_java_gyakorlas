package hu.tmx.colony;

import static hu.tmx.colony.geometry.RandomGenerator.directionRandom;

public class Worker extends Ant{

    public Worker(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int width) {
        getPosition().changePosition(directionRandom(), width);
    }
}
