package hu.tmx.colony;

import static hu.tmx.colony.geometry.RandomGenerator.directionRandom;

public class Queen extends Ant{

    public Queen(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int width) throws Exception {
        throw new Exception("Queen doesn't move");
    }
}
