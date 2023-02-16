package Kodlama.io.devs.entities.concretes;

public class ProgrammingLanguage {

    private String name;
    private int id;

    public ProgrammingLanguage(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public ProgrammingLanguage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
