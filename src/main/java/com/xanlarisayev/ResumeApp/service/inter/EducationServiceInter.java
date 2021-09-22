package com.xanlarisayev.ResumeApp.service.inter;

import com.xanlarisayev.ResumeApp.entity.Education;

public interface EducationServiceInter {
    boolean addEducation(Education education);
    boolean deleteEducation(Integer educationId);
}
