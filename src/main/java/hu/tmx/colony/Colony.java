package hu.tmx.colony;

public class Colony {

    private int width;
    private Queen queen;

    public Colony(int width) {
        this.width = width;
        this.queen = new Queen(width/2, width/2);
      //  this.generateAnts();
    }

//    private void generateAnts(int workers, int soldiers, int drones ){
//
//    }



}
