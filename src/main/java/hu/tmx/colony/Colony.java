package hu.tmx.colony;

import java.util.ArrayList;

import static hu.tmx.colony.geometry.RandomGenerator.antsRandom;
import static hu.tmx.colony.geometry.RandomGenerator.stepsRandom;

public class Colony {

    private final int width;
    private final Queen queen;
    private ArrayList<Ants> workerAnts;
    private ArrayList<Ants> soldierAnts;
    private ArrayList<Ants> droneAnts;

    public Colony(int width) {
        this.width = width;
        queen = new Queen(this.width /2, this.width /2);
        generateAnts(antsRandom(), antsRandom(), antsRandom());
    }

    private void generateAnts(int workers, int soldiers, int drones){
        workerAnts = new ArrayList<>();
        soldierAnts = new ArrayList<>();
        droneAnts = new ArrayList<>();
        getAnts(workerAnts, "Worker", workers);
        getAnts(soldierAnts, "Soldier", soldiers);
        getAnts(droneAnts, "Drone", drones);
    }

    public void update(){
        for (Ants workerA:workerAnts) {
            ((Worker) workerA).move();
        }
        for (Ants soldierA:soldierAnts) {
            ((Soldier) soldierA).move();
        }
    }

    private void getAnts(ArrayList<Ants> antVariety, String antType, int number){
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
