import java.util.Scanner;
/**
 * Main class that lists all the options from the menu
 *
 * @author Yuliia L.
 * @version 04.05.26
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        Scanner input = new Scanner(System.in);
        gameLibrary library = new gameLibrary();
        
        int choice;
        
        System.out.println("====Options====");
        System.out.println("1. Print library details");
        System.out.println("2. List all games");
        System.out.println("3. List games by genre");
        System.out.println("4. List games by platform");
        System.out.println("5. List games by age ratings");
        System.out.println("6. List top-rated games");
        System.out.println("7. Print game details");
        System.out.println("8. Rate a game");
        System.out.println("9. Start a game session");
        System.out.println("10. Print game session log");
        System.out.println("11. Add your own game");
        System.out.println("0. EXIT");
        
        System.out.print("Choice: ");
        choice = input.nextInt();
        
        switch (choice){
            case 1:
                library.toString();
                break;
            case 2:
                library.listAllGames();
                break;
            //case 3:
                //library.listByGenre();
                //break;
            //case 4:
                //library.listByPlatform();
                //break;
            //case 5:
                //library.listByAge();
                //break;
            //case 6:
                //library.topRated();
                //break;
            //case 7:
                //Game.getDetails();
                //break;
            //case 8:
                //Game.addRating();
                //break;
            case 9:
                //gameSession.Start();
                break;
            case 10:
                //gameSession.End();
                break; 
            case 11:
                System.out.print("Game name: ");
                String name = input.nextLine();
                
                System.out.print("Genre: ");
                Genre genre = Genre.valueOf(input.nextLine().toUpperCase());
                
                System.out.print("Platform: ");
                Platform platform = Platform.valueOf(input.nextLine().toUpperCase());
                
                System.out.print("Age rating: ");
                ageRating agerating = ageRating.valueOf(input.nextLine().toUpperCase()); //both class and objects named ageRating create problems.
                
                Game newGame = new Game(name, genre, platform, agerating);
                System.out.print("Game added");
                break;
            case 0:
                System.out.print("Goodbye!");
                break;
            default:
                System.out.println("Invalid input");
            }
            input.close();
        }
        }