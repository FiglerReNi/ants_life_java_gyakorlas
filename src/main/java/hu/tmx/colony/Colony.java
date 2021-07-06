package hu.tmx.colony;

import java.util.ArrayList;

import static hu.tmx.colony.RandomGenerator.antsRandom;
import static hu.tmx.colony.RandomGenerator.stepsRandom;

public class Colony {

    private int width;
    private Queen queen;

    public Colony(int width) {
        this.width = width;
        this.queen = new Queen(this.width /2, this.width /2);
        this.generateAnts(antsRandom(), antsRandom(), antsRandom());
    }

    private void generateAnts(int workers, int soldiers, int drones ){
        ArrayList<Worker> workerAnts = new ArrayList<Worker>();
        for (int i = 0; i < workers; i++){
            workerAnts.add(new Worker(stepsRandom(), stepsRandom()));
        }
        ArrayList<Soldier> soldierAnts = new ArrayList<Soldier>();
        ArrayList<Drone> droneAnts = new ArrayList<Drone>();

    }

    private Ants getAnts(String antsVariety, int number){
        for (int i = 0; i < number; i++){
            workerAnts.add(new + 'antsVariety'(stepsRandom(), stepsRandom()));
        }
    }


}
