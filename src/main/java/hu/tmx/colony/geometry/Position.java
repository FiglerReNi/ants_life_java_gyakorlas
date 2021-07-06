package hu.tmx.colony.geometry;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void changeDirection(Direction direction){
        switch (direction){
            case NORTH:
                if(y + 1 <= 100) y = y + 1;
                break;
            case EAST:
                if(x + 1 <= 100) x = x + 1;
                break;
            case SOUTH:
                if(y - 1 >= 0) y = y - 1;
                break;
            case WEST:
                if(x - 1 >= 0) x = x - 1;
                break;
        }
    }
}
