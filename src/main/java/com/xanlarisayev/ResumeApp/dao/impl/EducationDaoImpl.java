package com.xanlarisayev.ResumeApp.dao.impl;

import com.xanlarisayev.ResumeApp.dao.inter.EducationDaoInter;
import com.xanlarisayev.ResumeApp.entity.Education;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EducationDaoImpl implements EducationDaoInter {
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean addEducation(Education education) {
        try {
            em.persist(education);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteEducation(Integer educationId) {
        try {
            Education education = em.find(Education.class, educationId);
            em.remove(education);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
