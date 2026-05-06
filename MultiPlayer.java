
/**
 * Write a description of class MultiPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiPlayer extends Game
{
    private int maxPlayers;
    private boolean online;
    /**
     * Constructor for objects of class MultiPlayer
     */
    public MultiPlayer(String name, Genre genre, Platform platform, ageRating ageRating,
                        int maxPlayers, boolean online)
    {
        super(name,genre,platform,ageRating);
        this.maxPlayers = maxPlayers;
        this.online = online;
    }
    
    public void hostGame() {
        System.out.println("Hosting multiplayer game...");
    }
}