public class Point {
    public int x;
    public int y;

   public Point(){
        this(0,0);
    }

    Point (int x, int y) {
        this.x=x;
        this.y=y;
    }
    public void printPoint (){
        System.out.println("(" + x + "," + y + ")");
    }

    private Point center(Point other){
        return new Point ((x+other.x) / 2, (y+ other.y) / 2);
    }
}
