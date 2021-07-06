package hu.tmx.colony;

import hu.tmx.colony.geometry.Direction;
import hu.tmx.colony.geometry.RandomGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Colony colony = new Colony(100);
        System.out.println(colony);
        colony.update();
        System.out.println(colony);
        colony.update();
        System.out.println(colony);
        colony.update();
        System.out.println(colony);
        colony.update();
        System.out.println(colony);

//        Direction r = RandomGenerator.directionRandom();
//        System.out.println(r);
    }
}
