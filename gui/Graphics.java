package gui;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import logic.Ball;
import logic.Board;
import logic.Paddle;

/**
 * Graphics.java
 * Willem Hunt 2018
 * Paints the game state to the screen
 */
public class Graphics {

    private static final Color TEXT_COLOR = Color.WHITE;

    /**
     * Paints all objects to canvas.
     * @param board Board
     * @param context GraphicsContext
     */
    public static void paint(Board board, GraphicsContext context) {
        paintBoard(board, context);
        paintPaddles(board, context);
        paintBall(board, context);
        paintScores(board, context);
    }

    /**
     * Paints left and right scores to GraphicsContext
     * @param board Board
     * @param context GraphicsContext
     */
    private static void paintScores(Board board, GraphicsContext context) {
        context.setFill(TEXT_COLOR);
        context.setLineWidth(4);
        context.fillText(String.valueOf(board.getLeftScore()), 10, 10);
        context.fillText(String.valueOf(board.getRightScore()), Board.WIDTH-10, 10);
    }

    /**
     * Paints ball to GraphicsContext.
     * @param board Board
     * @param context GraphicsContext
     */
    private static void paintBall(Board board, GraphicsContext context) {
        Ball b = board.getBall();
        context.setFill(TEXT_COLOR);
        context.fillRect(b.getXPos(), b.getYPos(), Ball.SIZE, Ball.SIZE);
    }

    /**
     * Paints paddles to GraphicsContext
     * @param board Board
     * @param context GraphicsContext
     */
    private static void paintPaddles(Board board, GraphicsContext context) {
        Paddle leftPaddle   = board.getLeftPaddle();
        Paddle rightPaddle  = board.getRightPaddle();

        context.setFill(Paddle.COLOR);
        context.fillRect(25, leftPaddle.getYPos()-(Paddle.HEIGHT /2), Paddle.WIDTH, Paddle.HEIGHT);
        context.fillRect(Board.WIDTH -25, rightPaddle.getYPos()-(Paddle.HEIGHT /2), Paddle.WIDTH, Paddle.HEIGHT);
    }

    /**
     * Paints black board to GraphicsContext.
     * @param board Board
     * @param context GraphicsContext
     */
    private static void paintBoard(Board board, GraphicsContext context) {
        context.setFill(Board.COLOR);
        context.fillRect(0,0, Board.WIDTH, Board.HEIGHT);
    }

    /**
     * Paints reset message to GraphicsContext.
     * @param board Board
     * @param context Context
     */
    public static void paintResetMessage(Board board, GraphicsContext context) {
        paintBoard(board, context);
        context.setFill(TEXT_COLOR);
        context.setLineWidth(5);
        context.fillText("Game Over\nPress Enter To Reset", 20, Board.HEIGHT /2);
    }
}
