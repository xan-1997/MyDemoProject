package com.xanlarisayev.ResumeApp.dao.impl;

import com.xanlarisayev.ResumeApp.dao.inter.HobbyDaoInter;
import com.xanlarisayev.ResumeApp.entity.Hobby;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class HobbyDaoImpl implements HobbyDaoInter {
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean addHobby(Hobby hobby) {
        try {
            em.persist(hobby);
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteHobby(Integer hobbyId) {
        try {
            Hobby hobby = em.find(Hobby.class, hobbyId);
            em.remove(hobby);
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
