import java.util.ArrayList; 
import java.util.List;  
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private String name;
    private Genre genre;
    private Platform platform;
    private ageRating ageRating;
    private List<Double> ratings;
    
    /**
     * Constructor for objects of class Game
     */
    public Game(String name, Genre genre, Platform platform, ageRating ageRating)
    {
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        this.ratings = new ArrayList<>();
    }
    
    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        double sum = 0;
        for (double r : ratings) {
            sum += r;
        }
        return sum / ratings.size();
    }
    
    public void addRating(double rating) {
        ratings.add(rating);
    }
    
    public String getDetails() {
        return name + " (" + genre + ", " + platform + ") Rating: " + getAverageRating();
    }
    
    public String getName() {
        return name;
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    @Override
    public String toString () {
        return getDetails();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Game) {
            Game other = (Game) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }
}