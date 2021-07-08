package hu.tmx.colony;

import hu.tmx.colony.geometry.Direction;
import hu.tmx.colony.geometry.RandomGenerator;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Drone extends Ant{

    private int stayWithQueenCounter = 0;

    public Drone(int x, int y) {
        super(x, y);
    }
    @Override
    public void move(int width){
        try {
            FileWriter fw = new FileWriter("src/main/resources/move.log",true);
            BufferedWriter out = new BufferedWriter(fw);
            out.write("Queen is missing" + new Date() + "\n");
            out.close();
        } catch (IOException e) {
            System.out.println("FileWrite error" + e);
        }
    }

    public void move(int width, Queen queen) {
        if(getPosition().getX() != width/2){
            if(getPosition().getX() > width/2)
                getPosition().changePosition(Direction.WEST, width, 1);
            else
                getPosition().changePosition(Direction.EAST, width, 1);
        }else if(getPosition().getY() != width/2){
            if(getPosition().getY() > width/2)
                getPosition().changePosition(Direction.SOUTH, width, 1);
            else
                getPosition().changePosition(Direction.NORTH, width, 1);
        }
        if(getPosition().getX() == width/2 && getPosition().getY() == width/2){
            if(stayWithQueenCounter == 10) {
                stayWithQueenCounter = 0;
                Direction direction = RandomGenerator.directionRandom();
                switch (direction){
                    case NORTH:
                        getPosition().setY(width-1);
                        getPosition().setX(RandomGenerator.stepsRandom(width));
                        break;
                    case EAST:
                        getPosition().setY(RandomGenerator.stepsRandom(width));
                        getPosition().setX(width-1);
                        break;
                    case WEST:
                        getPosition().setY(RandomGenerator.stepsRandom(width));
                        getPosition().setX(0);
                        break;
                    case SOUTH:
                        getPosition().setY(0);
                        getPosition().setX(RandomGenerator.stepsRandom(width));
                        break;
                }
            }
            stayWithQueenCounter++;
        }
    }
}
