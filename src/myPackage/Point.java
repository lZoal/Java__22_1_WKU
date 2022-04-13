package myPackage;

public class Point {
    public int xpos,ypos;
   public static int count=0;

     public Point(int x,int y){
        xpos=x;
        ypos=y;
        count++;
    }
    Point() {
         count++;
    }
    public void PointMove(int x, int y){
        xpos=x;
        ypos=y;
    }
}