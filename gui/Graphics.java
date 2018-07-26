package gui;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import logic.Ball;
import logic.Board;
import logic.Game;
import logic.Paddle;

public class Graphics {

    private static final Color TEXT_COLOR = Color.WHITE;

    public static void paint(Board board, GraphicsContext context) {

        paintBoard(board, context);
        paintPaddles(board, context);
        paintBall(board, context);
        paintScores(board, context);

    }

    private static void paintScores(Board board, GraphicsContext context) {

        context.setFill(TEXT_COLOR);
        context.setLineWidth(4);

        context.fillText(String.valueOf(board.getLeftScore()), 10, 10);
        context.fillText(String.valueOf(board.getRightScore()), board.getWidth()-10, 10);

    }

    private static void paintBall(Board board, GraphicsContext context) {

        Ball b = board.getBall();
        context.setFill(TEXT_COLOR);
        context.fillRect(b.getX(), b.getY(), Ball.SIZE, Ball.SIZE);

    }

    private static void paintPaddles(Board board, GraphicsContext context) {

        Paddle leftPaddle   = board.getLeftPaddle();
        Paddle rightPaddle  = board.getRightPaddle();

        context.setFill(Paddle.COLOR);
        context.fillRect(25, leftPaddle.getYPos()-(Paddle.PADDLE_HEIGHT/2), Paddle.PADDLE_WIDTH, Paddle.PADDLE_HEIGHT);
        context.fillRect(Board.BOARD_WIDTH-25, rightPaddle.getYPos()-(Paddle.PADDLE_HEIGHT/2), Paddle.PADDLE_WIDTH, Paddle.PADDLE_HEIGHT);

    }

    private static void paintBoard(Board board, GraphicsContext context) {

        context.setFill(Board.COLOR);
        context.fillRect(0,0, board.getWidth(), board.getHeight());

    }

    public static void paintResetMessage(Board board, GraphicsContext context) {

        paintBoard(board, context);
        context.setFill(TEXT_COLOR);
        context.setLineWidth(5);
        context.fillText("Game Over\nPress Enter To Reset", 20, Board.BOARD_HEIGHT/2);

    }
}
