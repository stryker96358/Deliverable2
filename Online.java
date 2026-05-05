
/**
 * Write a description of class Online here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Online extends MultiPlayer
{
    private String serverName;
    /**
     * Constructor for objects of class Online
     */
    public Online(String name, Genre genre, Platform platform, ageRating ageRating,
                  int maxPlayers, String serverName)
    {
        super(name, genre, platform, ageRating, maxPlayers, true);
        this.serverName = serverName;
    }
    
    public void connect() {
        System.out.println("Connecting to server: " + serverName);
    }
}