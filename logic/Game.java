package logic;

import gui.Graphics;
import javafx.scene.canvas.GraphicsContext;

public class Game implements Runnable {

    private final static int BOARD_HEIGHT = 500;
    private final static int BOARD_WIDTH  = 700;

    private final static int PADDLE_HEIGHT = 100;
    private final static int PADDLE_WIDTH  = 20;

    private final static int    WIN_SCORE  = 10;
    private final        float  INTERVAL;

    private final   Board               board;
    private final   Paddle              leftPaddle;
    private final   Paddle              rightPaddle;
    private final   GraphicsContext     context;

    private boolean keyPressed;
    private boolean running;
    private boolean paused;

    /**
     * Default Constructor.
     * @param board Board for the game to take place on.
     * @param leftPaddle Left Paddle.
     * @param rightPaddle Right Paddle.
     * @param context GraphicsContext.
     */
    public Game(int frameRate, Board board, Paddle leftPaddle, Paddle rightPaddle, GraphicsContext context){

        INTERVAL = 1000.0f/frameRate;

        this.board = board;
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
        this.context = context;

        keyPressed = false;
    }

    /**
     * Updates the game state and maintains time interval.
     */
    @Override
    public void run() {

        while(running && !paused){

            float time = System.currentTimeMillis();
            keyPressed = false;
            board.update();

            Graphics.paint(board, context);

            if((board.getLeftScore() >= WIN_SCORE) || board.getRightScore() >= WIN_SCORE){
                pause();
                Graphics.paintResetMessage();
                break;
            }

            time = System.currentTimeMillis() - time;
            if(time < INTERVAL){
                try{
                    Thread.sleep((long)(INTERVAL - time));
                }catch (InterruptedException ignore){
                    ignore.printStackTrace();
                }
            }

        }
    }

    /**
     * Sets running flag to false;
     */
    public void stop(){
        running = false;
    }

    /**
     * Sets paused flag to false.
     */
    public void resume(){
        paused = false;
    }

    /**
     * Sets paused flag to true.
     */
    public void pause(){
        paused = true;
    }

    /**
     * Gets value of paused.
     * @return boolean paused.
     */
    public boolean isPaused(){
        return paused;
    }

    /**
     * Gets value of keyIsPressed.
     * @return boolean keyIsPressed.
     */
    public boolean keyIsPressed(){
        return keyPressed;
    }

    /**
     * Sets keyPressed flag to true.
     */
    public void setKeyPressed(){
        keyPressed = true;
    }

}
