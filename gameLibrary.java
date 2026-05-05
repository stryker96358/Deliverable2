
/**
 * Write a description of class gameLibrary here.
 *
 * @author Yuliia L.
 * @version 04.05.26
 */
import java.util.HashSet;

public class gameLibrary
{
    public HashSet<Game> library;
    /**
     * Constructor for objects of class gameLibrary
     */
    public gameLibrary()
    {
        library = new HashSet<>();
    }
    /**
     * Adds a game to the library
     */
    public void addGame(Game game){
        library.add(game);
    }
    /**
     * Prints all games in the library
     */
    public void listAllGames(){
        for (Game g : library){
            System.out.println(g);
        }
    }
    /**
     * @return a String with number of games
     */
    public String toString(){
        return "Game library contains " + library.size() + "games.";
    }
}