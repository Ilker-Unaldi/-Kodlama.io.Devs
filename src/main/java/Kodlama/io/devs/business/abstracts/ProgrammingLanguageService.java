package Kodlama.io.devs.business.abstracts;

import Kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage get(int id);
    void addLanguage(ProgrammingLanguage programmingLanguage) throws Exception;

    void deleteLanguage(int id);

    void updateLanguage(ProgrammingLanguage existProgrammingLanguage, ProgrammingLanguage newProgrammingLanguage);



}
