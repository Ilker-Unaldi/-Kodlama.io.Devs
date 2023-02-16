package Kodlama.io.devs.dataAccess.concretes;

import Kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepo;
import Kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepo {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguage() {
        programmingLanguages = new ArrayList<>();

     /* programmingLanguages.add(new ProgrammingLanguage("Java",1));
        programmingLanguages.add(new ProgrammingLanguage("C#",2));
        programmingLanguages.add(new ProgrammingLanguage("Python",3));
        programmingLanguages.add(new ProgrammingLanguage("JS",4));
        programmingLanguages.add(new ProgrammingLanguage("SQL",5));
        programmingLanguages.add(new ProgrammingLanguage("HTML",6))*/;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void addLanguage(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage getLanguage(int id) {

        return programmingLanguages.get(id);
    }

    @Override
    public void deleteLanguage(int id) {
        programmingLanguages.remove(id);
    }

    @Override
    public void updateLanguage(ProgrammingLanguage existProgrammingLanguage, ProgrammingLanguage newProgramingLanguage) {
        programmingLanguages.set(existProgrammingLanguage.getId(), newProgramingLanguage);

    }
}
