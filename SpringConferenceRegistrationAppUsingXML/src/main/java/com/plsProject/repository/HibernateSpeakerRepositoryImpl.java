package com.plsProject.repository;

import com.plsProject.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {



    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Alexandru");
        speaker.setLastName("Din");

        speakers.add(speaker);

        return speakers;
    }
}
