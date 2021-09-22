package com.xanlarisayev.ResumeApp.service.inter;

import com.xanlarisayev.ResumeApp.entity.Practic;

public interface PracticeServiceInter {
    boolean addPractice(Practic practic);
    boolean deletePractice(Integer practiceId);
}
