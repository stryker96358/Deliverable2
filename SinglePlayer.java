
/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SinglePlayer extends Game 
{
    private boolean storyMode;
    private int completionTime;
    /**
     * Constructor for objects of class SinglePlayer
     */
    public SinglePlayer(String name, Genre genre, Platform platform, ageRating ageRating,
                        boolean storyMode, int completionTime)
    {
        super(name,genre,platform,ageRating);
        this.storyMode = storyMode;
        this.completionTime = completionTime;
    }
    
    public void play() {
        System.out.println("Playing single-player game...");
    }
}