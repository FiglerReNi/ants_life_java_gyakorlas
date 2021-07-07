package hu.tmx.colony;

import java.util.ArrayList;

import static hu.tmx.colony.geometry.RandomGenerator.stepsRandom;

public class Colony {

    private final int width;
    private Queen queen;
    private ArrayList<Ant> workerAnts = new ArrayList<>();
    private ArrayList<Ant> soldierAnts = new ArrayList<>();
    private ArrayList<Ant> droneAnts = new ArrayList<>();
    private Ant[][] ant;

    public Colony(int width) {
        this.width = width;
        queen = new Queen(this.width/2, this.width/2);
        ant = new Ant[this.width][this.width];
        ant[this.width/2][this.width/2] = queen;
    }

    public void generateAnts(int workers, int soldiers, int drones){
        getAnts(workerAnts, "Worker", workers);
        getAnts(soldierAnts, "Soldier", soldiers);
        getAnts(droneAnts, "Drone", drones);
    }

    public void update(){
        for (Ant workerA:workerAnts) {
            replacePosition(((Worker) workerA));
        }
        for (Ant soldierA:soldierAnts) {
            replacePosition(((Soldier) soldierA));
        }
        for (Ant droneA:droneAnts) {
            replacePosition(((Drone) droneA));
        }
    }

    private void getAnts(ArrayList<Ant> antVariety, String antType, int number){
        for (int i = 0; i < number; i++){
           switch (antType){
               case "Worker":
                   Worker worker = new Worker(stepsRandom(this.width), stepsRandom(this.width));
                   antVariety.add(worker);
                   ant[worker.getPosition().getX()][worker.getPosition().getY()] = worker;
                   break;
               case "Soldier":
                   Soldier soldier = new Soldier(stepsRandom(this.width), stepsRandom(this.width));
                   antVariety.add(soldier);
                   ant[soldier.getPosition().getX()][soldier.getPosition().getY()] = soldier;
                   break;
               case "Drone":
                   Drone drone = new Drone(stepsRandom(this.width), stepsRandom(this.width));
                   antVariety.add(drone);
                   ant[drone.getPosition().getX()][drone.getPosition().getY()] = drone;
                   break;
           }
        }
    }

    public void display(){
       for(int i = 0; i < this.width; i++){
           for(int j = 0; j < this.width; j++){
               if(ant[i][j] == null) {
                   System.out.print(".");
               }
               else {
                   if(ant[i][j] instanceof Queen) {
                       System.out.print('Q');
                   }else if(ant[i][j] instanceof Worker) {
                       System.out.print('W');
                   }else if(ant[i][j] instanceof Soldier){
                       System.out.print('S');
                   }else if(ant[i][j] instanceof Drone){
                       System.out.print('D');
                   }
               }
           }
           System.out.print("\n");
        }
    }

    private void replacePosition(Ant antItem){
        if(antItem.getPosition().getX() != width/2 || antItem.getPosition().getY() != width/2) {
            ant[antItem.getPosition().getX()][antItem.getPosition().getY()] = null;
        }
        antItem.move(this.width);
        if(antItem.getPosition().getX() != width/2 || antItem.getPosition().getY() != width/2) {
            ant[antItem.getPosition().getX()][antItem.getPosition().getY()] = antItem;
        }
    }
}
