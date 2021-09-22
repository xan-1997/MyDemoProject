package com.xanlarisayev.ResumeApp.dao.impl;

import com.xanlarisayev.ResumeApp.dao.inter.ProfileDaoInter;
import com.xanlarisayev.ResumeApp.entity.Language;
import com.xanlarisayev.ResumeApp.entity.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class ProfileDaoImpl implements ProfileDaoInter {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Profile> getAll() {
        Query query = em.createQuery("select p from Profile p");
        return query.getResultList();
    }

    @Override
    public Profile getById(Integer id) {
        Profile profile = em.find(Profile.class, id);
        return profile;
    }

    @Override
    public boolean update(Profile profile) {
        try{
            em.merge(profile);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        try{
            Profile profile = em.find(Profile.class, id);
            em.remove(profile);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean add(Profile profile) {
        try{
            em.persist(profile);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
