package logic;

import javafx.scene.paint.Color;

public class Board {

    public static final Color   COLOR   = Color.BLACK;
    public static final int     WIDTH   = 700;
    public static final int     HEIGHT  = 500;

    private Paddle leftPaddle;
    private Paddle rightPaddle;

    private int leftScore;
    private int rightScore;

    Board(){

        int startHeight = (Board.HEIGHT/2)-(Paddle.HEIGHT/2);
        this.leftPaddle     = new Paddle(startHeight, this);
        this.rightPaddle    = new Paddle(startHeight, this);

    }

}
