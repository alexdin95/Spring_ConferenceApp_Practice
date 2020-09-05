package com.plsProject.repository;

import com.plsProject.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository") // acum acest bean va fi setat ca Repository utilizand Stereotype Annotation
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Value("#{T(java.lang.Math).random() * 100}")

    private double seedNum;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Alexandru");
        speaker.setLastName("Din");

        speaker.setSeedNum(seedNum);

        System.out.println("cal: " + cal.getTime());
        speakers.add(speaker);

        return speakers;
    }
}
