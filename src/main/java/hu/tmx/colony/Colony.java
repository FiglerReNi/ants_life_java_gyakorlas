package hu.tmx.colony;

import static hu.tmx.colony.RandomGenerator.antsRandom;

public class Colony {

    private int width;
    private Queen queen;

    public Colony(int width) {
        this.width = width;
        this.queen = new Queen(this.width /2, this.width /2);
        this.generateAnts(antsRandom(), antsRandom(), antsRandom());
    }

    private void generateAnts(int workers, int soldiers, int drones ){


    }



}
