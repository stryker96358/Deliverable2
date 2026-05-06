
/**
 * Write a description of class GameSession here.
 *
 * @author Yuliia L.
 * @version 04.05.26
 */
public class gameSession
{
    long start;
    long finish;
    long timeElapsed;
    /**
     * Constructor for objects of class gameSession
     */
    public gameSession(){
        
    }
    /**
     *
     * Start a game session
     */
    public void Start(){
        long start = System.currentTimeMillis() / 1000;
        this.start = start;
    }
    /**
     * Method to end  a game session
     */
    public void End(){
        long finish = System.currentTimeMillis() /1000;
        this.finish = finish;
    }
    /**
     * Get a total time of a session
     */
    public long getSummary(){
        long timeElapsed = finish - start;
        System.out.println("Total session time: " + timeElapsed);
        return timeElapsed;
    }
}
