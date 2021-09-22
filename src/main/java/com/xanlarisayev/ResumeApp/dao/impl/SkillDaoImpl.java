package com.xanlarisayev.ResumeApp.dao.impl;

import com.xanlarisayev.ResumeApp.dao.inter.SkillDaoInter;
import com.xanlarisayev.ResumeApp.entity.Skill;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SkillDaoImpl implements SkillDaoInter {
    @PersistenceContext
    EntityManager em;

    @Override
    public boolean addSkill(Skill skill) {
        try {
            em.persist(skill);
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteSkill(Integer skillId) {
        try {
            Skill skill = em.find(Skill.class, skillId);
            em.remove(skill);
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
