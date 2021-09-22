package com.xanlarisayev.ResumeApp.service.impl;

import com.xanlarisayev.ResumeApp.dao.inter.PracticeDaoInter;
import com.xanlarisayev.ResumeApp.entity.Practic;
import com.xanlarisayev.ResumeApp.service.inter.PracticeServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PracticeServiceImpl implements PracticeServiceInter {

    @Autowired
    private PracticeDaoInter pdi;

    @Override
    public boolean addPractice(Practic practic) {
        return pdi.addPractice(practic);
    }

    @Override
    public boolean deletePractice(Integer practiceId) {
        return pdi.deletePractice(practiceId);
    }
}
