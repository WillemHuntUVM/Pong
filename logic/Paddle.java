package logic;

import javafx.scene.paint.Color;

public class Paddle {

    public static final Color COLOR = Color.WHITE;

    private final int width;
    private final int height;

    private int yPos;
    private int yVel;

    /**
     * Constructor.  Takes in a starting Y position and a Board to link to.
     * @param yPos Y position.
     */
    Paddle(int yPos, Board board, int width, int height){
        this.yPos   = yPos;

        this.width  = width;
        this.height = height;

        this.yVel = 0;
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
}
