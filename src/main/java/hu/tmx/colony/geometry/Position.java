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

    public void changePosition(Direction direction, int width, int step){
        switch (direction){
            case NORTH:
                if(y + step < width) setY(getY() + step);
                break;
            case EAST:
                if(x + step < width) setX(getX() + step);
                break;
            case SOUTH:
                if(y - step >= 0) setY(getY() - step);
                break;
            case WEST:
                if(x - step >= 0) setX(getX() - step);
                break;
        }
    }
}
