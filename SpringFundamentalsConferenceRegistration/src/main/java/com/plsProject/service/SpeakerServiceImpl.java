package com.plsProject.service;

import com.plsProject.model.Speaker;
import com.plsProject.repository.HibernateSpeakerRepositoryImpl;
import com.plsProject.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
@Scope(value= BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {
    // adaugam si in clasa asta o metoda finder mai jos
    // O punem si aici pentru ca ne-ar permite sa folosim si un alt repository/  Asta ne permite si sa schimbam intre ele.

    private SpeakerRepository repository;

    // Cream default Constructor

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository Constructor");
        repository = speakerRepository;
    }
    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no arguments Constructor");
    }
    @PostConstruct
    private void initialize(){
        System.out.println("We are called after the constructors");
    }

    //@Autowired // Va injecta automat acel SpeakerRepository bean in acest Setter.
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl Setter");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    //in final am creat si o interfata:
}
