package logic;

import javafx.scene.canvas.GraphicsContext;

public class Game implements Runnable {

    private final   Board               board;
    private final   Paddle              leftPaddle;
    private final   Paddle              rightPaddle;
    private final   GraphicsContext     context;

    private final static int BOARD_HEIGHT = 500;
    private final static int BOARD_WIDTH  = 700;

    private final static int PADDLE_HEIGHT = 100;
    private final static int PADDLE_WIDTH  = 20;

    public Game(Board board, Paddle leftPaddle, Paddle rightPaddle, GraphicsContext context){
        this.board = board;
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
        this.context = context;
    }

    @Override
    public void run() {

    }
}
