package logic;

import javafx.scene.paint.Color;

public class Board {

    public static final Color   COLOR   = Color.BLACK;
    public final static int BOARD_HEIGHT = 500;
    public final static int BOARD_WIDTH  = 700;
    private       final int     WIDTH;
    private       final int     HEIGHT;

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball   ball;

    private int leftScore = 0;
    private int rightScore = 0;

    Board(int width, int height, Paddle leftPaddle, Paddle rightPaddle){

        this.HEIGHT = height;
        this.WIDTH  = width;

        this.leftPaddle     = leftPaddle;
        this.rightPaddle    = rightPaddle;

    }

    public void update() {

    }

    public int getLeftScore() {
        return leftScore;
    }

    public int getRightScore() {
        return rightScore;
    }

    public double getWidth() {
        return WIDTH;
    }

    public double getHeight() {
        return HEIGHT;
    }

    public Ball getBall() {
        return ball;
    }

    public Paddle getLeftPaddle() {
        return leftPaddle;
    }

    public Paddle getRightPaddle() {
        return rightPaddle;
    }
}
