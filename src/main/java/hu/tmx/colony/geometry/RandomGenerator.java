package hu.tmx.colony.geometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    private final static Random RANDOM = new Random();

    public static int stepsRandom(int width){
        int rand = (int) (Math.random() * width);
        while(rand == width/2){
            rand = (int) (Math.random() * width);
        }
        return rand;
    }

    public static Direction directionRandom(){
        List<Direction> VALUES = Collections.unmodifiableList(Arrays.asList(Direction.values()));
        int SIZE = VALUES.size();
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static int moodRandom(int from, int to){
        return RANDOM.nextInt(to - from + 1) + from;
    }
}
