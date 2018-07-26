package logic;

import javafx.scene.paint.Color;

public class Board {

    public static final Color   COLOR   = Color.BLACK;
    private       final int     WIDTH;
    private       final int     HEIGHT;

    private Paddle leftPaddle;
    private Paddle rightPaddle;

    private int leftScore;
    private int rightScore;

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
}
