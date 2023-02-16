package Kodlama.io.devs.dataAccess.abstracts;

import Kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProgrammingLanguageRepo {

    List<ProgrammingLanguage> getAll();
    void addLanguage(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getLanguage(int id);
    void deleteLanguage(int id);
    void updateLanguage(ProgrammingLanguage existProgrammingLanguage, ProgrammingLanguage newProgramingLanguage);


}
