package logic;

import javafx.scene.paint.Color;

public class Paddle {

    public static final Color   COLOR   = Color.WHITE;
    public static final int     HEIGHT  = 100;
    public static final int     WIDTH   = 20;

    private final Board board;

    private int yPos;
    private int yVel;

    /**
     * Constructor.  Takes in a starting Y position and a Board to link to.
     * @param yPos Y position.
     */
    Paddle(int yPos, Board board){
        this.yPos = yPos;
        this.yVel = 0;
        this.board = board;
    }

    /**
     * Sets the vertical velocity of the paddle.  Negative values move the paddle downwards.
     * @param velocity pixels per update.
     */
    public void setYVel(int velocity){

    }

    /**
     * Getter for Y position.
     * @return Y
     */
    public int getYPos(){
        return this.yPos;
    }

    /**
     * Getter for Y velocity.
     * @return Y Velocity
     */
    public int getYVel(){
        return this.yVel;
    }

    /**
     * Getter for Board.
     * @return Board
     */
    public Board getBoard() {
        return board;
    }
}
