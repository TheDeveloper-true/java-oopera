import java.util.Objects;

public class Actor extends Person{
    private int height;

    public Actor(String name, String surname, int height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return name + " " + surname + "(" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(surname, actor.surname) && Objects.equals(name, actor.name)
                && Objects.equals(height, actor.height) && Objects.equals(gender, actor.gender);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, height, gender);
        result = result * 31;
        return result;
    }
}
