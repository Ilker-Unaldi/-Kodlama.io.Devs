package Kodlama.io.devs.business.concretes;

import Kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepo;
import Kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepo programmingLanguageRepo;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepo programmingLanguageRepo) {
        this.programmingLanguageRepo = programmingLanguageRepo;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepo.getAll();
    }

    @Override
    public ProgrammingLanguage get(int id) {
        return programmingLanguageRepo.getLanguage(id);
    }

    @Override
    public void addLanguage(ProgrammingLanguage programmingLanguage) throws Exception {

        if (isNameAlreadyExist(programmingLanguage)) {
            throw new Exception("Error: Name is already exist");
        } else if (isEmpty(programmingLanguage)) {
            throw new Exception("Error:Name is empty");
        }
        else{
            programmingLanguageRepo.addLanguage(programmingLanguage);
        }

    }

    @Override
    public void deleteLanguage(int id) {
        programmingLanguageRepo.deleteLanguage(id);

    }

    @Override
    public void updateLanguage(ProgrammingLanguage existProgrammingLanguage, ProgrammingLanguage newProgrammingLanguage) {
        programmingLanguageRepo.updateLanguage(existProgrammingLanguage,newProgrammingLanguage);

    }

    private boolean isNameAlreadyExist(ProgrammingLanguage name){

        boolean result=false;
        List<ProgrammingLanguage> Plist=programmingLanguageRepo.getAll();
        for (ProgrammingLanguage p: Plist) {
            if (p.getName().equals(name.getName())){
                result= true;
                break;
            }
        }
        return result;
    }

    private  boolean isEmpty(ProgrammingLanguage p){
        boolean result=false;
        if (p.getName().isEmpty()){
            result=true;
        }
        return result;
    }


}
