package hu.tmx.colony;

import static hu.tmx.colony.geometry.RandomGenerator.stepsRandom;

public class Colony {

    private final int width;
    private final Queen queen;
    private Ant ant[][];
    private Ant temp[][];

    public Colony(int width) {
        this.width = width;
        queen = new Queen(this.width/2, this.width/2);
        ant = new Ant[this.width][this.width];
        ant[this.width/2][this.width/2] = queen;
    }

    public void generateAnts(int workers, int soldiers, int drones){
        getAnts("Worker", workers);
        getAnts("Soldier", soldiers);
        getAnts("Drone", drones);
    }

    public void update(){
        temp = new Ant[this.width][this.width];
        temp[this.width/2][this.width/2] = queen;
        for (Ant[] antRow: ant){
            for(Ant antItem:antRow){
                if(antItem != null)
                    replacePosition(antItem);
            }
        }
        ant = temp;
    }

    private void getAnts(String antType, int number){
        for (int i = 0; i < number; i++){
           switch (antType){
               case "Worker":
                   Worker worker = new Worker(stepsRandom(this.width), stepsRandom(this.width));
                   ant[worker.getPosition().getX()][worker.getPosition().getY()] = worker;
                   break;
               case "Soldier":
                   Soldier soldier = new Soldier(stepsRandom(this.width), stepsRandom(this.width));
                   ant[soldier.getPosition().getX()][soldier.getPosition().getY()] = soldier;
                   break;
               case "Drone":
                   Drone drone = new Drone(stepsRandom(this.width), stepsRandom(this.width));
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
        ant[antItem.getPosition().getX()][antItem.getPosition().getY()] = null;
        antItem.move(this.width);
        temp[antItem.getPosition().getX()][antItem.getPosition().getY()] = antItem;
    }
}
