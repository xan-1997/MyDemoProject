package com.xanlarisayev.ResumeApp.service.inter;

import com.xanlarisayev.ResumeApp.entity.Skill;

public interface SkillServiceInter {
    boolean addSkill(Skill skill);
    boolean deleteSkill(Integer skillId);
}
