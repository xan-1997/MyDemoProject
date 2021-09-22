package com.xanlarisayev.ResumeApp.dao.inter;

import com.xanlarisayev.ResumeApp.entity.Language;

public interface LanguageDaoInter {
    boolean addLanguage(Language language);
    boolean deleteLanguage(Integer languageId);
}
