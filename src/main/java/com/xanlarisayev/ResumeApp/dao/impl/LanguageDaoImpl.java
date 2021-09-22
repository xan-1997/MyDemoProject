package com.xanlarisayev.ResumeApp.dao.impl;

import com.xanlarisayev.ResumeApp.dao.inter.LanguageDaoInter;
import com.xanlarisayev.ResumeApp.entity.Language;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class LanguageDaoImpl implements LanguageDaoInter {
    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean addLanguage(Language language) {
        try{
            em.persist(language);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteLanguage(Integer languageId) {
        try{
            Language language = em.find(Language.class, languageId);
            em.remove(language);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
    }
}
