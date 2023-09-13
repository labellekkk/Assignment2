import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.*;

public class CheckerBoard extends GraphicsProgram {
    public void run() {

        final int BOARD_SIZE = 8;
        final int SIZE = getHeight() / BOARD_SIZE;
        final int CIRCLE_SIZE = SIZE - 8 ;


        //  j = column , i = row

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                double checkerBoard = ( j * SIZE) + (getWidth() / 2 - (BOARD_SIZE * SIZE) / 2);
                GRect rect = new GRect(checkerBoard , i * SIZE, SIZE, SIZE);
                boolean isFilled = (i + j) % 2 == 1;
                rect.setFilled(isFilled);
                rect.setFillColor(Color.gray);
                add(rect);

                if (isFilled) {
                    double circleX = checkerBoard + (SIZE - CIRCLE_SIZE) / 2.0;
                    double circleY = ( i * SIZE)  + (SIZE - CIRCLE_SIZE) / 2.0;
                    if (i < 3) {
                        GOval circle = new GOval(circleX , circleY , CIRCLE_SIZE , CIRCLE_SIZE);
                        circle.setFilled(true);
                        circle.setFillColor(Color.red);
                        add(circle);
                    }
                    if (i >= 5) {
                        GOval circle = new GOval(circleX ,circleY , CIRCLE_SIZE , CIRCLE_SIZE);
                        circle.setFilled(true);
                        circle.setFillColor(Color.black);
                        add(circle);
                    }
                }



                }

            }print(CIRCLE_SIZE);
        }
    }



