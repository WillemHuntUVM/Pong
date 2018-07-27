package logic;

import javafx.scene.paint.Color;

/**
 * Board.java
 * Willem Hunt 2018
 * Manages the game board and pieces, along with updating the game state.
 */
public class Board {

    public static final Color   COLOR   = Color.BLACK;
    public final static int HEIGHT = 500;
    public final static int WIDTH = 700;

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;

    private int leftScore = 0;
    private int rightScore = 0;

    /**
     * Constructor
     * @param leftPaddle Paddle
     * @param rightPaddle Paddle
     * @param ball Ball
     */
    Board(Paddle leftPaddle, Paddle rightPaddle, Ball ball){
        this.leftPaddle     = leftPaddle;
        this.rightPaddle    = rightPaddle;
        this.ball           = ball;
    }

    /**
     * Updates the game state
     */
    public void update() {

    }

    /**
     * Getter for leftScore
     * @return leftScore
     */
    public int getLeftScore() {
        return leftScore;
    }

    /**
     * Getter for rightScore
     * @return rightScore
     */
    public int getRightScore() {
        return rightScore;
    }

    /**
     * Getter for ball
     * @return ball
     */
    public Ball getBall() {
        return ball;
    }

    /**
     * Getter for leftPaddle
     * @return leftPaddle
     */
    public Paddle getLeftPaddle() {
        return leftPaddle;
    }

    /**
     * Getter for rightPaddle
     * @return rightPaddle
     */
    public Paddle getRightPaddle() {
        return rightPaddle;
    }
}
