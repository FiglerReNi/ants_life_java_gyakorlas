package hu.tmx.colony;

import hu.tmx.colony.geometry.RandomGenerator;

import static hu.tmx.colony.geometry.RandomGenerator.directionRandom;

public class Queen extends Ant{

    private int mood;
    private int from = 2;
    private int to = 4;

    public Queen(int x, int y) {
        super(x, y);
        mood = RandomGenerator.moodRandom(from, to);
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

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    @Override
    public void move(int width) throws Exception {
        throw new Exception("Queen doesn't move");
    }
}
