package Kodlama.io.devs.webApi.controllers;


import Kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    @PostMapping("/add")
    void addLanguage(ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.addLanguage(programmingLanguage);
    };

    @DeleteMapping("/delete/{id}")
    void deleteLanguage(@PathVariable int id){
        programmingLanguageService.deleteLanguage(id);
    };
    @GetMapping("/get/{id}")
    ProgrammingLanguage getLanguageById(@PathVariable int id){
        return programmingLanguageService.get(id);
    }
    @PutMapping("/put")
    void updateLanguage(ProgrammingLanguage existProgrammingLanguage,ProgrammingLanguage newProgrammingLanguage){
        programmingLanguageService.updateLanguage(existProgrammingLanguage,newProgrammingLanguage);
    }



}
