package com.xanlarisayev.ResumeApp.dao.inter;

import com.xanlarisayev.ResumeApp.entity.Profile;

import java.util.List;

public interface ProfileDaoInter {
    List<Profile> getAll();
    Profile getById(Integer id);
    boolean update(Profile profile);
    boolean delete(Integer id);
    boolean add(Profile profile);
}
