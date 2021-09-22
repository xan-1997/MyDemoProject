package com.xanlarisayev.ResumeApp.service.impl;

import com.xanlarisayev.ResumeApp.dao.inter.EducationDaoInter;
import com.xanlarisayev.ResumeApp.entity.Education;
import com.xanlarisayev.ResumeApp.service.inter.EducationServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationServiceImpl implements EducationServiceInter {

    @Autowired
    private EducationDaoInter edi;

    @Override
    public boolean addEducation(Education education) {
        return edi.addEducation(education);
    }

    @Override
    public boolean deleteEducation(Integer educationId) {
        return edi.deleteEducation(educationId);
    }
}
