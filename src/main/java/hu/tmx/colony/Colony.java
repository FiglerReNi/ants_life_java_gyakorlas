package hu.tmx.colony;

import java.util.ArrayList;

import static hu.tmx.colony.RandomGenerator.antsRandom;
import static hu.tmx.colony.RandomGenerator.stepsRandom;

public class Colony {

    private int width;
    private Queen queen;
    private ArrayList<Ants> workerAnts;
    private ArrayList<Ants> soldierAnts;
    private ArrayList<Ants> droneAnts;

    public Colony(int width) {
        this.width = width;
        queen = new Queen(this.width /2, this.width /2);
        this.generateAnts(antsRandom(), antsRandom(), antsRandom());
    }

    private void generateAnts(int workers, int soldiers, int drones ){
        workerAnts = new ArrayList<Ants>();
        soldierAnts = new ArrayList<Ants>();
        droneAnts = new ArrayList<Ants>();
        getAnts(workerAnts, "Worker", workers);
        getAnts(soldierAnts, "Soldier", soldiers);
        getAnts(droneAnts, "Drone", workers);


    }

    private void getAnts(ArrayList<Ants> antVariety, String antType,   int number){
        for (int i = 0; i < number; i++){
           switch (antType){
               case "Worker":
                   antVariety.add(new Worker(stepsRandom(), stepsRandom()));
                   break;
               case "Soldier":
                   antVariety.add(new Soldier(stepsRandom(), stepsRandom()));
                   break;
               case "Drone":
                   antVariety.add(new Drone(stepsRandom(), stepsRandom()));
                   break;
           }
        }
    }

    @Override
    public String toString() {
        return "Colony{" +
                "width=" + width +
                ", queen=" + queen +
                ", workerAnts=" + workerAnts +
                ", soldierAnts=" + soldierAnts +
                ", droneAnts=" + droneAnts +
                '}';
    }
}
