package pack2;
import myPackage.*;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Main2실행");

        Point a=new Point(10,20);
        System.out.printf("[ %d, %d ] count : %d \n",a.xpos,a.ypos,a.count);

        Point b=new Point(20,40);
        System.out.printf("[ %d, %d ] count : %d \n",a.xpos,a.ypos,a.count);

        a.PointMove(b.xpos,b.ypos);
        System.out.printf("[ %d, %d ] count : %d \n",a.xpos,a.ypos,a.count);

    }
}
