import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {
    public void run() {


        final int BRICK_WIDTH = 30;
        final int BRICK_HEIGHT = 12;
        final int BRICKS_IN_BASE = 14;



        double xBrick =(getWidth() - BRICK_WIDTH) / 2 ;
        double yBrick = (getHeight() - BRICK_HEIGHT) / 2 ;


        for (int i = 1; i <= BRICKS_IN_BASE; i++) {
            for (int j = 0; j <= i-1; j++) {
               double x = xBrick - (BRICK_WIDTH * (i -1))/2  + j * BRICK_WIDTH ;
               double y = yBrick+BRICK_HEIGHT*(i -1) ;


                GRect brick = new GRect( x , y , BRICK_WIDTH , BRICK_HEIGHT);
                add(brick);
            }
        }

        }


    }
