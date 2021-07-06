package hu.tmx.colony;

public class RandomGenerator {

    public static int antsRandom(){
        return (int) (Math.random() * 5);
    }

    public static int stepsRandom(){
        return (int) (Math.random() * 101);
    }
}
