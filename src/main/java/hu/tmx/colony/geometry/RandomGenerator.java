package hu.tmx.colony.geometry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

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
        Random RANDOM = new Random();
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
