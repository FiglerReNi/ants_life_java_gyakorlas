package hu.tmx.colony.geometry;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void changePosition(Direction direction, int width){
        switch (direction){
            case NORTH:
                if(y + 1 <= width) setY(getY() + 1);
                break;
            case EAST:
                if(x + 1 <= width) setX(getX() + 1);
                break;
            case SOUTH:
                if(y - 1 >= 0) setY(getY() - 1);
                break;
            case WEST:
                if(x - 1 >= 0) setX(getX() - 1);
                break;
        }
    }
}
