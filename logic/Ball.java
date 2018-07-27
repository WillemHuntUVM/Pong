package logic;

/**
 * Ball.java
 * Willem Hunt 2018
 * Manages the position and velocity of the ball
 */
public class Ball {

    public static final int SIZE = 10;
    private int x;
    private int y;
    private int dx;
    private int dy;

    /**
     * Reverses X direction and adjusts Y velocity based on bounce location
     * @param paddle Paddle to bounce off of
     */
    public void Bounce(Paddle paddle){
        setDx(getDx()*-1);
        setDy(makeVector(paddle));
    }

    /**
     * Reverses Y direction for a bounce off of floor or ceiling.
     */
    public void Bounce(){
        setDy(getDy()*-1);
    }

    /**
     * Calculates new Y velocity from location of ball bounce
     * @param paddle Paddle
     * @return new dY
     */
    private int makeVector(Paddle paddle) {
        int newDY = getDy();
        double paddleCenter = paddle.getYPos() + Paddle.HEIGHT /2;
        double ballCenter   = this.getYPos() + Ball.SIZE/2;
        newDY *= (90/55);
        return newDY;
    }

    /**
     * Getter for x position
     * @return X
     */
    public int getXPos() {
        return x;
    }

    /**
     * Getter for y position
     * @return Y
     */
    public int getYPos() {
        return y;
    }

    /**
     * Getter for dX
     * @return dX
     */
    public int getDx() {
        return dx;
    }

    /**
     * Setter for dX
     * @param dx new dX
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    /**
     * Getter for dY
     * @return dY
     */
    public int getDy() {
        return dy;
    }

    /**
     * Setter for dY
     * @param dy new dY
     */
    public void setDy(int dy) {
        this.dy = dy;
    }
}
