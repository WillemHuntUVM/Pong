package logic;

import javafx.scene.paint.Color;

/**
 * Paddle.java
 * Willem Hunt 2018
 * Manages position and motion of paddles
 */
public class Paddle {

    public static final Color   COLOR   = Color.WHITE;
    public final static int     HEIGHT  = 100;
    public final static int     WIDTH   = 20;

    private int yPos;
    private int yVel;

    /**
     * Constructor.  Takes in a starting Y position and a Board to link to.
     * @param yPos Y position.
     */
    Paddle(int yPos, Board board){
        this.yPos   = yPos;
        this.yVel = 0;
    }

    /**
     * Sets the vertical velocity of the paddle.  Negative values move the paddle downwards.
     * @param velocity pixels per update.
     */
    public void setYVel(int velocity){
        yVel = velocity;
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
}
