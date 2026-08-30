import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private Director choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  Director musicAuthor, String librettoText, Director choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
