package com.xanlarisayev.ResumeApp.dao.inter;

import com.xanlarisayev.ResumeApp.entity.Skill;

public interface SkillDaoInter {
    boolean addSkill(Skill skill);
    boolean deleteSkill(Integer skillId);

}
