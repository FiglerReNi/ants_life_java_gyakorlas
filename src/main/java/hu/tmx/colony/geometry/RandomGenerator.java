package hu.tmx.colony.geometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static int antsRandom(){
        return (int) ((Math.random() * 5) + 1);
    }

    public static int stepsRandom(){
        int rand = (int) (Math.random() * 101);
        while(rand == 50){
            rand = (int) (Math.random() * 101);
        }
        return rand;
    }

    public static Direction directionRandom(){
        List<Direction> VALUES = Collections.unmodifiableList(Arrays.asList(Direction.values()));
        int SIZE = VALUES.size();
        Random RANDOM = new Random();
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
