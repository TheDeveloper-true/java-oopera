import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors(){
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor newActor) {
        boolean isAlreadyAdded = false;
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)){
                isAlreadyAdded = true;
            }
        }
        if(!isAlreadyAdded) {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor oldActor, Actor newActor) {
        if (listOfActors.contains(oldActor)) {
            listOfActors.set(listOfActors.indexOf(oldActor), newActor);
        }
    }
}
