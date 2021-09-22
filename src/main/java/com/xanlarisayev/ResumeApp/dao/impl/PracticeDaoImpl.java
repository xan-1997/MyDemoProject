package com.xanlarisayev.ResumeApp.dao.impl;

import com.xanlarisayev.ResumeApp.dao.inter.PracticeDaoInter;
import com.xanlarisayev.ResumeApp.entity.Practic;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PracticeDaoImpl implements PracticeDaoInter {
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean addPractice(Practic practic) {
        try {
            em.persist(practic);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePractice(Integer practiceId) {
        try {
            Practic practice = em.find(Practic.class, practiceId);
            em.remove(practice);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}
