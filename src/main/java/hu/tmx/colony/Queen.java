package hu.tmx.colony;

import hu.tmx.colony.geometry.RandomGenerator;

import static hu.tmx.colony.geometry.RandomGenerator.directionRandom;

public class Queen extends Ant{

    private int stepsUntilReady;
    private int from = 2;
    private int to = 4;
    private boolean readyToMate = false;

    public Queen(int x, int y) {
        super(x, y);
        stepsUntilReady = RandomGenerator.moodRandom(from, to);
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getStepsUntilReady() {
        return stepsUntilReady;
    }

    public void setStepsUntilReady(int stepsUntilReady) {
        this.stepsUntilReady = stepsUntilReady;
    }

    public boolean isReadyToMate() {
        return readyToMate;
    }

    public void setReadyToMate(boolean readyToMate) {
        this.readyToMate = readyToMate;
    }

    @Override
    public void move(int width) throws Exception {
        throw new Exception("Queen doesn't move");
    }
}
