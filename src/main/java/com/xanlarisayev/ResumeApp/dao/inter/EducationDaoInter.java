package com.xanlarisayev.ResumeApp.dao.inter;

import com.xanlarisayev.ResumeApp.entity.Education;

public interface EducationDaoInter {
    boolean addEducation(Education education);
    boolean deleteEducation(Integer educationId);
}
