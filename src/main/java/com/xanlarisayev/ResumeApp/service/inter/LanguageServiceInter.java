package com.xanlarisayev.ResumeApp.service.inter;

import com.xanlarisayev.ResumeApp.entity.Language;

public interface LanguageServiceInter {
    boolean addLanguage(Language language);
    boolean deleteLanguage(Integer languageId);
}
