package com.plsProject.service;

import com.plsProject.model.Speaker;
import com.plsProject.repository.HibernateSpeakerRepositoryImpl;
import com.plsProject.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    // adaugam si in clasa asta o metoda finder mai jos
    // O punem si aici pentru ca ne-ar permite sa folosim si un alt repository/  Asta ne permite si sa schimbam intre ele.
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
    }
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    // HARD Codat --> utilizarea repository-ului  in aceasta clasa
    // (acum nu poate fi interschimbat, iar aceasta problema o vom rezolva cu ajutorul Spring)
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    //in final am creat si o interfata:
}
