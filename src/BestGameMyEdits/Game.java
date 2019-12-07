package BestGameMyEdits;

import comp127graphics.CanvasWindow;
import comp127graphics.Point;

public class Game {

    private static final int CANVAS_WIDTH = 1600;
    private static final int CANVAS_HEIGHT = 800;
    private CanvasWindow canvas;

    private Sidekick sidekick = new Sidekick();
    private Protagonist protagonist = new Protagonist();

    private boolean clicked = false;


    public Game() {

        canvas = new CanvasWindow("Best Game!", CANVAS_WIDTH, CANVAS_HEIGHT);
        canvas.add(sidekick);
        canvas.add(protagonist, 200, 300);


        canvas.onClick(event -> {
            if (canvas.getElementAt(event.getPosition()) == sidekick) {
                clicked = !clicked;
            }
        });

        canvas.onMouseMove(event -> {
            if (clicked)
                sidekick.setCenter(event.getPosition());
        });

        canvas.onDrag(event -> {
            if (clicked) {
                if (canvas.getElementAt(event.getPreviousPosition()) == sidekick) {
                    canvas.onMouseUp(event1 -> {
                        clicked = false;
                        Point startPoint = event.getPreviousPosition();
                        Point endPoint = event1.getPosition();
                        double xChange = startPoint.getX() - endPoint.getX();
                        double yChange = startPoint.getY() - endPoint.getY();
                        Point pointChange = new Point(xChange, yChange);
                        getThrowSpecs(pointChange);
                        Throw();
                    });

                }
            }
        });

    }

    public static void main(String[] args) {
        new Game();
    }

    private void getThrowSpecs(Point pointChange) {
        double xChange = -pointChange.getX() * .1;
        double yChange = -pointChange.getY() * .1;

        sidekick.setMotionX(xChange);
        sidekick.setMotionY(yChange);

    }

    private void Throw() {
        canvas.animate(() -> {
            sidekick.moveBy(sidekick.getMotionX(), sidekick.getMotionY());
        });
    }
}

