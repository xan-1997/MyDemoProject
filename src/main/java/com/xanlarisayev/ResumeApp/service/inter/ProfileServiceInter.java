package com.xanlarisayev.ResumeApp.service.inter;

import com.xanlarisayev.ResumeApp.entity.Profile;

import java.util.List;

public interface ProfileServiceInter {
    List<Profile> getAll();
    Profile getById(Integer id);
    boolean update(Profile profile);
    boolean delete(Integer id);
    boolean add(Profile profile);
}
