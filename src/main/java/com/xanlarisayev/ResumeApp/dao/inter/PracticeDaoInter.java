package com.xanlarisayev.ResumeApp.dao.inter;

import com.xanlarisayev.ResumeApp.entity.Practic;

public interface PracticeDaoInter {
    boolean addPractice(Practic practic);
    boolean deletePractice(Integer practiceId);
}
