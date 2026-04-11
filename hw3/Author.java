package hw3;

public class Author {
    public String name;
    public String surname;
    public int reting;

    public Author(String name, String surname, int reting) {
        this.name = name;
        this.surname = surname;
        this.reting = reting;
    }

    public String toString() {
        return "[ " + name + " " + surname + " (" + reting + ") ]";
    }

}
