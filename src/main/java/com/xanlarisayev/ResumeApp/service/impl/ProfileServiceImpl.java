package com.xanlarisayev.ResumeApp.service.impl;

import com.xanlarisayev.ResumeApp.dao.inter.ProfileDaoInter;
import com.xanlarisayev.ResumeApp.entity.Profile;
import com.xanlarisayev.ResumeApp.service.inter.ProfileServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileServiceInter {

    @Autowired
    private ProfileDaoInter pdi;


    @Override
    public List<Profile> getAll() {
        return pdi.getAll();
    }

    @Override
    public Profile getById(Integer id) {
        return pdi.getById(id);
    }

    @Override
    public boolean update(Profile profile) {
        return pdi.update(profile);
    }

    @Override
    public boolean delete(Integer id) {
        return pdi.delete(id);
    }

    @Override
    public boolean add(Profile profile) {
        return pdi.add(profile);
    }
}
