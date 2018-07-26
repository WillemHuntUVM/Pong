package logic;

public class Ball {

    public static final int SIZE = 10;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private double angle = 0;

    public void Bounce(Paddle paddle){

        int paddleCenter    = paddle.getYPos()+Paddle.PADDLE_HEIGHT/2;
        int ballCenter      = this.getYPos()+Ball.SIZE/2;

        angle = paddleCenter - ballCenter;
        if(angle > 80)angle = 80;
        if(angle < -80)angle = -80;

    }

    public int getXPos() {
        return x;
    }

    public int getYPos() {
        return y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
}
