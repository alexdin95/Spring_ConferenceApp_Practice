package com.plsProject.repository;

import com.plsProject.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
