import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        String librettoText = "Текст Либретто";
        Actor firstActor = new Actor("Иван", "Иванов", 182, Gender.MALE);
        Actor secondActor = new Actor("Петр", "Петров", 176, Gender.MALE);
        Actor thirdActor = new Actor("Ольга", "Сидорова", 162, Gender.FEMALE);
        Director firstDirector = new Director("Максим", "Андреев", 31, Gender.MALE);
        Director secondDirector = new Director("Андрей", "Максимов", 15, Gender.MALE);
        Director musicAuthor = new Director("Владислав", "Конев", 317, Gender.MALE);
        Director choreographer = new Director("Марина", "Соколова", 23, Gender.FEMALE);
        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();


        Show show = new Show("Шоу", 155, firstDirector, showActors);
        Opera opera = new Opera("Опера", 68, secondDirector, operaActors, musicAuthor, librettoText,
                31);
        Ballet ballet = new Ballet("Баллет", 78, firstDirector, balletActors, musicAuthor, librettoText,
                choreographer);

        show.addNewActor(firstActor);
        show.addNewActor(secondActor);
        opera.addNewActor(secondActor);
        opera.addNewActor(thirdActor);
        ballet.addNewActor(firstActor);
        ballet.addNewActor(thirdActor);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        opera.replaceActor(secondActor, firstActor);
        opera.printListOfActors();

        ballet.replaceActor(secondActor, thirdActor);

        opera.printLibretto();
        ballet.printLibretto();
    }
}
