package com.xanlarisayev.ResumeApp.service.impl;

import com.xanlarisayev.ResumeApp.dao.inter.LanguageDaoInter;
import com.xanlarisayev.ResumeApp.entity.Language;
import com.xanlarisayev.ResumeApp.service.inter.LanguageServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LanguageServiceImpl implements LanguageServiceInter {

    @Autowired
    private LanguageDaoInter ldi;

    @Override
    public boolean addLanguage(Language language) {
        return ldi.addLanguage(language);
    }

    @Override
    public boolean deleteLanguage(Integer languageId) {
        return ldi.deleteLanguage(languageId);
    }
}
