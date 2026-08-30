public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, int numberOfShows, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.numberOfShows = numberOfShows;
        this.gender = gender;
    }

    public void printDirectorInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }
}
