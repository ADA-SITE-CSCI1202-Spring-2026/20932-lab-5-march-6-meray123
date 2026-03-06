public class Point implements Movable {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(int distance){
        y += distance;
    }

    @Override
    public void moveDown(int distance){
        y -= distance;
    }

    @Override
    public void moveLeft(int distance){
        x -= distance;
    }

    @Override
    public void moveRight(int distance){
        x += distance;
    }

    @Override
    public String toString(){
        return "Point(" + x + ", " + y + ")";
    }
}